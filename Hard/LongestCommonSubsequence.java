import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LongestCommonSubsequence {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	if(line.trim().length()<=0){
        		continue;
        	}
            String[] input = line.split(";");
            int maxCount=0;
            String maxResult="";
            String value1="";
            String value2="";
            for(int i=0;i<input[1].length();i++){
            	char val = input[1].charAt(i);
            	if(input[0].contains(String.valueOf(val)))
            		value1+=val;
            }
            for(int i=0;i<input[0].length();i++){
            	char val = input[0].charAt(i);
            	if(input[1].contains(String.valueOf(val)))
            		value2+=val;
            }
            
            int[][] mat = new int[value1.length()+1][value2.length()+1];
            for(int i=1;i<=value1.length();i++){
            	for(int j=1;j<=value2.length();j++){
                	if(value1.charAt(i-1)==value2.charAt(j-1)){
                		mat[i][j]=mat[i-1][j-1]+1;
                		if(mat[i][j]>maxCount)
                			maxCount=mat[i][j];
                	} else {
                		if( mat[i][j-1]> mat[i-1][j])
                			mat[i][j] = mat[i][j-1];
                		else 
                			mat[i][j] = mat[i-1][j];
                	}
                }
            }
            
            for(int i=value1.length();i>=1;i--){
            	for(int j=1;j<=value2.length();j++){
            		if(mat[i][j]==maxCount && mat[i][j-1]!=maxCount && mat[i-1][j]!=maxCount){
            			maxResult=value1.charAt(i-1)+maxResult;
            			maxCount--;
            		}
                }
            }
            System.out.println(maxResult.trim());
        }
	}
}


/*    INPUT
HXNYGROGXYJKZGKKB;VPNEOQQOCXSIRFA
KPZOIVGFEEIPYR;LWZMMTAFFPYFRMZKLBD
GXERWXIFVPLJVTHYVMQKQJ;DZJFKOALEDHL
MPCURZAYSGLVSHHMRRU;IOCKGLSJESWDZBLIHMDFZY
BPWYZADNGDYDTRKYDGZXBC;HYBWLUUVOIZKJD
QSIUPPCCQIOFYCZBVEFGWU;IQHLNKACEVCAETR
VDAAYWWKRJPAHRWKM;DDEDLSSPMFUBDPCTRWLA
IBSKNSKLCPLGKMIXHBCDQ;ZLWPYLUOUI
VYOXETMCCTCFRNNVGEGW;OUPLNSAVJGUXWBGWDDDDS
the quick brown fox;the fast brown dogs
VGMXTBRHWPZJOQVKNZCGTU;KCPJOUROUY
GPOJECIFRVMUWRNE;JIXFPMAUPPWTYSCXZZSZR
BCHHHPMGFLUIDJ;KNSIXSVGIVGCE
thisisatest;testing123testing
SAXNOBIMSI;ANJBOLZBGNHRBKGNIB
MWNRXCZUEBAHVRJVF;WYPHCXDLQYTMIPWNPF
BTPDWMWFOIU;ITMKLODCGJAL
BVGLDIVUZJ;IHZDWFOWLKPKR
hello world mordor;lord of the rings
LZOENHXJELVLFXCDXWVCXR;EQTCRIGMKZMAVABXPHE
    
    EXPECTED OUTPUT
NOX                                                                                   
ZFPYR                                                                                 
FLH                                                                                   
CGLSHM                                                                                
BWZKD                                                                                 
IQCVE                                                                                 
DPRW                                                                                  
LPLI                                                                                  
ONVGGW                                                                                
the  brown o                                                                          
PJOU                                                                                  
JIFMUWR                                                                               
GI                                                                                    
tsitest                                                                               
ANOBI                                                                                 
MWNF                                                                                  
TMO                                                                                   
IZ                                                                                    
lord or                                                                               
ECVX   
 
*/





