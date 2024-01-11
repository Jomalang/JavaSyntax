import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EX11_11 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //큐의 최대 길이 5로 설정
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				// 화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); //메서드 체이닝, 메서드의 반환값이 참조변수일때 사용가능
				
				if("".equals(input)) continue; //입력이 빈칸이면 continue실행
				
				if(input.equalsIgnoreCase("q")) { //q입력하면 종료
					System.exit(0);
				}
				else if (input.equalsIgnoreCase("Help")) { //대소문자 구분없이 비교하는 메서드
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 " 
					+ MAX_SIZE+"개 보여줍니다.");
				}
				else if (input.equalsIgnoreCase("history")) {
					save(input); //입력받은 명령어를 저장하고,
					
					LinkedList list = (LinkedList)q; // 형변환
					
					final int SIZE = list.size(); //자주 호출되는 변수는 상수화
					for(int i = 0; i <SIZE; i++)
						System.out.println((i+1)+"."+list.get(i));
					}
				else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("입력 오류입니다.");
			}
		} //while(true) end	
	} //main() end
	
	public static void save(String input) {
		// offer
		if(!"".equals(input))
			q.offer(input);
		
		// q의 최대크기 넘으면 처음 입력된 값 poll
		if(q.size() > MAX_SIZE)
			q.remove();
	}

} //class EX11_11 end
