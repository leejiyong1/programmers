package Day0405;

public class Dice3 {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 1;
        int d = 2;
        int answer = 0;
        int[] dice = new int[6];
        int[] arr = {a, b, c, d};
        for (int i = 0; i < arr.length; i++) {
            dice[arr[i] - 1]++;
        }

        boolean found = false; // 점수 계산이 완료되었는지를 체크하는 플래그
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 4) {
                answer = 1111 * (i + 1);
                found = true;
                break; // 점수 계산 완료
            } else if (dice[i] == 3) {
                for (int j = 0; j < dice.length; j++) {
                    if (dice[j] == 1) {
                        answer = (10 * (i + 1) + (j + 1)) * (10 * (i + 1) + (j + 1));
                        found = true;
                        break; // 점수 계산 완료
                    }
                }
            } else if (dice[i] == 2) {
                for (int j = 0; j < dice.length; j++) {
                    if (j != i && dice[j] == 2) {
                        answer = ((i + 1) + (j + 1)) * Math.abs((i + 1) - (j + 1));
                        found = true;
                        break; // 점수 계산 완료
                    } else if (j != i && dice[j] == 1) {
                        for (int cn = j + 1; cn < dice.length; cn++) {
                            if (dice[cn] == 1) {
                                answer = (j + 1) * (cn + 1);
                                found = true;
                                break; // 점수 계산 완료
                            }
                        }
                    }
                    if(found) break;
                }
            }
            if(found) break;
        }

        if (!found) { // "다름" 조건
            int min = 7;
            for (int i = 0; i < 4; i++) {
                if (arr[i] < min) min = arr[i];
            }
            answer = min;
        }

        System.out.println(answer);
    }
}