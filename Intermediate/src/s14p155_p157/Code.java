package s14p155_p157;

public class Code implements Comparable<Code> {

	private String sectionNo;
	private String lectureNo;
	
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	
	public String getSectionNo() {
		return sectionNo;
	}
	
	public String getLectureNo() {
		return lectureNo;
	}
	
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	
	/* compareTo method to sort the combined number in alphabetical order.  */
	public int compareTo(Code o) {
		/* Use concat to get combined number.  */
		String code1 = sectionNo.concat(lectureNo);
		/* Use the Code object o to invoke getters method to get combined number.  */
		String code2 = o.getSectionNo() + o.getLectureNo();
		/* Returns -1 if code1 < code2, 1 if code1 > code2, 0 if code1 = code2.  */
		return code1.compareTo(code2);
	}
	
}
