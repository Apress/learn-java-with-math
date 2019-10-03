public class IntersectionOverUnion {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3f, 2f, 5f, 7f);
		Rectangle r2 = new Rectangle(4f, 1f, 6f, 8f);
		System.out.println("IOU=" + getIOU(r1, r2));
		
		r1 = new Rectangle(3f, 2f, 5f, 7f);
		r2 = new Rectangle(1f, 1f, 6f, 8f);
		System.out.println("IOU=" + getIOU(r1, r2));
		
		r1 = new Rectangle(3f, 2f, 5f, 7f);
		r2 = new Rectangle(6f, 1f, 7f, 8f);
		System.out.println("IOU=" + getIOU(r1, r2));
	}
	
	public static float getIOU(Rectangle r1, Rectangle r2) {
		float areaR1 = r1.getHeight() * r1.getWidth();
		float areaR2 = r2.getHeight() * r2.getWidth();
		
		float overlapArea = 0f;
		if (r1.x_min >= r2.x_max || r1.x_max <= r2.x_min ||
				r1.y_min >= r2.y_max || r1.y_max <= r2.y_min) {
			return 0f;
		}

		overlapArea = computeOverlap(
					Math.max(r1.x_min, r2.x_min),
					Math.min(r1.x_max, r2.x_max),
					Math.max(r1.y_min, r2.y_min),
					Math.min(r1.y_max, r2.y_max));
		
		System.out.println(overlapArea + " / (" + areaR1 
				+ " + " + areaR2 + " - " + overlapArea + ")");
		return overlapArea / (areaR1 + areaR2 - overlapArea);
	}
	
	private static float computeOverlap(float lx1, float lx2, float ly1, float ly2) {
		float w = lx2 - lx1;
		if (w < 0) w = -w;
		float h = ly2 - ly1;
		if (h < 0) h = -h;
		return w * h;
	}
}
