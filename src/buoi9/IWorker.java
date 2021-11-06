package buoi9;
/*
 * interface: trừu tượng 100% -> không tạo đc đối tượng và không chứa các thành phần instance
 * chứa: 
 * + biến: final + static
 * + hàm: abstract  ( chỉ khai báo không có thân hàm) / static ( có thân hàm, thuộc phạm vi tĩnh interface)
 *	tính chất: 1interface được kế thừa nhiều interface
 *- 1 class được kế thừa 1 class và được thực thi (implements) nhiều interface
 * */
// hợp đồng của người lao động
public interface IWorker {
	// biến: final static 
	String moTa = "Hợp đồng của người lao động";
	// hàm
	public static void descript() {
		System.out.println(moTa);
	}
	// hàm abstract: không có thân hàm, chỉ có khai báo
	void doWork();
}
