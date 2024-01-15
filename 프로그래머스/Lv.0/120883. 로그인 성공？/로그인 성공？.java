class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(int i = 0; i < db.length; i++) {
            if(id_pw[0].equals(db[i][0])) { // id 같은 경우
                if(id_pw[1].equals(db[i][1])) { // pw 같은 경우
                    return "login";
                }
                else {
                    return "wrong pw";
                }
            }
        }
        
        return "fail";
    }
}