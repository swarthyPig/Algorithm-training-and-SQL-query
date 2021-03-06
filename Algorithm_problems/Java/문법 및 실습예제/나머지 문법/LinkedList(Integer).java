import java.util.*;

// 실행시키는 단축키 : ctrl + f11
// 글꼴 크기 변경 : ctrl + (+, -)
// 글자정렬 : ctrl + a -> ctrl + i
// 문장 복사 : ctrl + alt + 방향키
// 문장 위아래 이동 : alt + 방향키
// 전체주석 : ctrl + shift + /
// 전체주석풀기 : ctrl + shift + 달러표시
//int input = (new Scanner(System.in)).nextInt();

public class Young {

	public static void main(String[] args) {

		LinkedList<Integer> li = new LinkedList<>(); // 제네릭 안에는 class만 들어갈 수 있다.

		System.out.println(li.size()); // 현재 LinkedList의 크기를 볼 수 있음.
		li.add(100); // 값을 넣음
		System.out.println(li.size());

		for (int i = 0; i < 10; i++) { // for문으로 값을 쭉 넣음
			li.add(i * 10 + i);
		}
		System.out.println(li.size());
		
//------------------------------------------------------------------------------------------
		
		// 읽는 방법1번째
		System.out.println(li); // 보여주기만 한 것

		// 읽는 방법 2번째
		for (int i = 0, size = li.size(); i < size; i++) {
			System.out.print(li.get(i) + " "); 
		}System.out.println();

		int a = li.get(2); // 변수에 저장 할 수 있다
		System.out.println(a);

		// 읽는 방법 3번째, foreach문
		for (Integer i : li) {
			System.out.print(i + " ");
		}System.out.println();

		// 추가
		li.add(4, 777); // index 4 자리에 777 넣음
		System.out.println(li);

		// 수정
		li.set(4, 999);
		System.out.println(li);

		// 삭제
		li.remove(4);
		System.out.println(li);

		li.add(4, 777);
		System.out.println(li);

		// 검색
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i) == 777) { // 검색
				li.remove(i); // 777삭제
				break;
			}
		}
		System.out.println(li);

		li.add(0, 10);
		li.add(0, 20);
		li.add(0, 30);
		li.add(0, 40);
		System.out.println(li);
		
		for (int i = 0; i < li.size(); i++) { // 삭제된 인덱스 그다음 인덱스는 삭제가 제대로 안이루어진다.(연속으로 짝수 일때),(size의 값이 계속 변하기 때문)
			if (li.get(i) % 2 == 0) {
				li.remove(i);
			}
		}
		System.out.println(li);
		
		for (int i = 0; i < li.size();) { // 정상작동
			if (li.get(i) % 2 == 0) {
				li.remove(i);
			} else {
				i++;
			}
		}
		System.out.println(li);
		
		for (int i = 0, size = li.size(); i < size;) { // 정상작동x size의 값이 고정되기때문
			if (li.get(i) % 2 == 0) {
				li.remove(i);
			} else {
				i++;
			}
		}
		System.out.println(li);
	}
}
