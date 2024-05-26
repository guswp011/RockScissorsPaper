import java.util.Scanner;

public class ch01_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 가위 바위 보 선택
        System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 선택하세요!:");
        int userChoice = scanner.nextInt();
        
        // 컴퓨터가 랜덤으로 선택
        int computerChoice = (int) (Math.random() * 3) + 1;
        
        // 사용자와 컴퓨터의 선택 출력
        System.out.print("당신의 선택: ");
        printChoice(userChoice);
        System.out.print("컴퓨터의 선택: ");
        printChoice(computerChoice);
        
        // 결과 출력
        determineWinner(userChoice, computerChoice);
        
        scanner.close();
    }
    
    // 사용자와 컴퓨터의 선택 출력
    public static void printChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("가위");
                break;
            case 2:
                System.out.println("바위");
                break;
            case 3:
                System.out.println("보");
                break;
            default:
                System.out.println("잘못된 값");
                break;
        }
    }
    
    // 승패 결정
    public static void determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            System.out.println("비겼습니다!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("이겼습니다!");
        } else {
            System.out.println("졌습니다...");
        }
    }
}