package ch10.exam;

public class Student {
	private String name;
	private int sno;
	private String major;
	private int[] score;
	private String[] grade;
	private double[] point;
//	private int java;
//	private int db;
//	private int python;
	private double avg;
	private int rank = 1;
	private String adv;

	public String getAdv() {
		return adv;
	}

	public void setAdv() {
		this.adv = this.avg > 85 ? "장학금 지급" : " ";
	}

	public void setGrade() {
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 95) {
				grade[i] = "A+";
				point[i] = 4.5;
			} else if (score[i] >= 90) {
				grade[i] = "A";
				point[i] = 4.0;
			} else if (score[i] > 85) {
				grade[i] = "B+";
				point[i] = 3.5;
			} else if (score[i] >= 80) {
				grade[i] = "B";
				point[i] = 3.0;
			} else if (score[i] >= 75) {
				grade[i] = "C+";
				point[i] = 2.5;
			} else if (score[i] >= 70) {
				grade[i] = "C";
				point[i] = 2.0;
			} else {
				grade[i] = "F";
				point[i] = 0;
			}

		}
	}

	public Student() {
	}

	public Student(String name, int sno, String major, int[] score) {
		super();
		this.name = name;
		this.sno = sno;
		this.major = major;
		this.score = score;
		setAvg();
		setAdv();
		grade = new String[3];
		point = new double[3];
		setGrade();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		this.avg = sum / 3.0;
	}

	public void setRank(Student other) {
		if (this.avg < other.avg) {
			rank++;
		}
	}

	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {
		String scoreStr = "";
		for (int i = 0; i < score.length; i++) {
			scoreStr += score[i] + " ";
		}
		return name + " " + sno + " " + major + " " + scoreStr + " " + avg + " " + rank + " " + adv;
	};

	public void display() {
		String[] subject = { "자바", "db", "Python" };
		System.out.println("이름 :" + name);
		System.out.println("학번 : " + sno);
		System.out.println("전공 : " + major);
		System.out.println("======성적처리결과======");
		System.out.println("과목 \tscore\tgrade\t학점");
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print(subject[i] + "\t");
			System.out.println(score[i] + "\t" + grade[i] + "\t" + point[i]);
			sum += point[i];
		}
		System.out.println("학점평균 : " + (sum / 3));
	}

}