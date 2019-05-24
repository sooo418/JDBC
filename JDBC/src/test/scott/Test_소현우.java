package test.scott;

import java.util.List;

import vo.DeptVO;

public class Test_소현우 {

	public static void main(String[] args) {
		DeptManager_소현우 dm = new DeptManager_소현우();
		if (dm != null) {
			List<DeptVO> list = dm.getDepts();
			list.forEach(i -> System.out.println(i));
		}
	}

}
