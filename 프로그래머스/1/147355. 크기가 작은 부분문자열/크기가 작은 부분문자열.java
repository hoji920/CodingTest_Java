class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int lenT = t.length();
        int lenP = p.length();

        long pNum = Long.parseLong(p);  // p는 한 번만 숫자로 변환

        for (int i = 0; i <= lenT - lenP; i++) {
            // 길이 lenP 만큼 자르기
            String sub = t.substring(i, i + lenP);

            // 숫자로 변환
            long subNum = Long.parseLong(sub);

            // 비교
            if (subNum <= pNum) {
                answer++;
            }
        }

        return answer;
    }
}