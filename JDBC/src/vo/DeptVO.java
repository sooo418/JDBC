package vo;

public class DeptVO {
	private int deptno;
	private String dname;
	private String lec;
	
	public DeptVO() {
		super();
	}

	public DeptVO(int deptno, String dname, String lec) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.lec = lec;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLec() {
		return lec;
	}

	public void setLec(String lec) {
		this.lec = lec;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptno;
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		result = prime * result + ((lec == null) ? 0 : lec.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeptVO other = (DeptVO) obj;
		if (deptno != other.deptno)
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		if (lec == null) {
			if (other.lec != null)
				return false;
		} else if (!lec.equals(other.lec))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "deptVO [deptno=" + deptno + ", dname=" + dname + ", lec=" + lec + "]";
	}
	
	
}
