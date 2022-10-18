package Daily;

public class DecryptCaesarCipher {
    public String decryptCaesarCipher(String str, int secret) {
        //반복문으로 공백확인하고 문자인 경우, secret만큼 더해줌
        String [] output = new String[str.length()];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(" ");
            }
            else{
                int c = ((int)str.charAt(i) - secret);
                if(c > 122){
                    sb.append((char)(c -122 + 96));
                }
                else if(c< 97){
                    sb.append((char)(122 -(96 - c)));
                }
                else{
                    sb.append((char)(c));
                }
            }
        }
        return sb.toString();
    }
}
