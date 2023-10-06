import java.lang.String;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] ch=dnaStrand.toCharArray();
        for(int i=0;i<dnaStrand.length();i++){
            if(ch[i]=='T')ch[i]='A';
            else if(ch[i]=='A')ch[i]='U';
            else if(ch[i]=='G')ch[i]='C';
            else ch[i]='G';
        }
        return new String(ch);
    }

}
