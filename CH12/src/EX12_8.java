import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111") //�̷��� ��ȿ���� ���� ���ڿ��� ������ ���õȴ�.
@TestInfo(testedBy="Johyeonjin", testTools = {"JUnit", "JUnit5"}, testDate=@DateTime(yymmdd="240122", hhmmss="194000"))
public class EX12_8 {
	public static void main(String[] args) {
		Class<EX12_8> cls = EX12_8.class; //EX12_8�� Class ��ü�� ��´�.
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		
		System.out.println("anno.testedBy() = "+anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = "+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() = "+anno.testDate().hhmmss());
		
		for(String str : anno.testTools())
			System.out.println("testTools = "+str);
		
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);

	}

}

@Retention(RetentionPolicy.RUNTIME) // ���� ��å�� RUNTIME���� ����
@interface TestInfo {
	int count ()			default 1;
	String testedBy();
	String[] testTools()	default "JUnit";
	TestType testType()		default TestType.FIRST;
	DateTime testDate();
}


@Retention(RetentionPolicy.RUNTIME) // ���� ��å�� RUNTIME���� ����
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType {FIRST, FINAL}