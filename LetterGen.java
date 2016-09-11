import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class LetterGen {
  public static void main(String args[])
  {
    String pathToLetters="./letters.txt";
    String[] letters = {"AA","AB","AC","AD","AE","AF","AG","AH","AI","AJ","AK","AL","AM","AN","AO","AP","AQ","AR","AS","AT","AU","AV","AW","AX","AY","AZ","BA","BB","BC","BD","BE","BF","BG","BH","BI","BJ","BK","BL","BM","BN","BO","BP","BQ","BR","BS","BT","BU","BV","BW","BX","BY","BZ","CA","CB","CC","CD","CE","CF","CG","CH","CI","CJ","CK","CL","CM","CN","CO","CP","CQ","CR","CS","CT","CU","CV","CW","CX","CY","CZ","DA","DB","DC","DD","DE","DF","DG","DH","DI","DJ","DK","DL","DM","DN","DO","DP","DQ","DR","DS","DT","DU","DV","DW","DX","DY","DZ","EA","EB","EC","ED","EE","EF","EG","EH","EI","EJ","EK","EL","EM","EN","EO","EP","EQ","ER","ES","ET","EU","EV","EW","EX","EY","EZ","FA","FB","FC","FD","FE","FF","FG","FH","FI","FJ","FK","FL","FM","FN","FO","FP","FQ","FR","FS","FT","FU","FV","FW","FX","FY","FZ","GA","GB","GC","GD","GE","GF","GG","GH","GI","GJ","GK","GL","GM","GN","GO","GP","GQ","GR","GS","GT","GU","GV","GW","GX","GY","GZ","HA","HB","HC","HD","HE","HF","HG","HH","HI","HJ","HK","HL","HM","HN","HO","HP","HQ","HR","HS","HT","HU","HV","HW","HX","HY","HZ","IA","IB","IC","ID","IE","IF","IG","IH","II","IJ","IK","IL","IM","IN","IO","IP","IQ","IR","IS","IT","IU","IV","IW","IX","IY","IZ","JA","JB","JC","JD","JE","JF","JG","JH","JI","JJ","JK","JL","JM","JN","JO","JP","JQ","JR","JS","JT","JU","JV","JW","JX","JY","JZ","KA","KB","KC","KD","KE","KF","KG","KH","KI","KJ","KK","KL","KM","KN","KO","KP","KQ","KR","KS","KT","KU","KV","KW","KX","KY","KZ","LA","LB","LC","LD","LE","LF","LG","LH","LI","LJ","LK","LL","LM","LN","LO","LP","LQ","LR","LS","LT","LU","LV","LW","LX","LY","LZ","MA","MB","MC","MD","ME","MF","MG","MH","MI","MJ","MK","ML","MM","MN","MO","MP","MQ","MR","MS","MT","MU","MV","MW","MX","MY","MZ","NA","NB","NC","ND","NE","NF","NG","NH","NI","NJ","NK","NL","NM","NN","NO","NP","NQ","NR","NS","NT","NU","NV","NW","NX","NY","NZ","OA","OB","OC","OD","OE","OF","OG","OH","OI","OJ","OK","OL","OM","ON","OO","OP","OQ","OR","OS","OT","OU","OV","OW","OX","OY","OZ","PA","PB","PC","PD","PE","PF","PG","PH","PI","PJ","PK","PL","PM","PN","PO","PP","PQ","PR","PS","PT","PU","PV","PW","PX","PY","PZ","QA","QB","QC","QD","QE","QF","QG","QH","QI","QJ","QK","QL","QM","QN","QO","QP","QQ","QR","QS","QT","QU","QV","QW","QX","QY","QZ","RA","RB","RC","RD","RE","RF","RG","RH","RI","RJ","RK","RL","RM","RN","RO","RP","RQ","RR","RS","RT","RU","RV","RW","RX","RY","RZ","SA","SB","SC","SD","SE","SF","SG","SH","SI","SJ","SK","SL","SM","SN","SO","SP","SQ","SR","SS","ST","SU","SV","SW","SX","SY","SZ","TA","TB","TC","TD","TE","TF","TG","TH","TI","TJ","TK","TL","TM","TN","TO","TP","TQ","TR","TS","TT","TU","TV","TW","TX","TY","TZ","UA","UB","UC","UD","UE","UF","UG","UH","UI","UJ","UK","UL","UM","UN","UO","UP","UQ","UR","US","UT","UU","UV","UW","UX","UY","UZ","VA","VB","VC","VD","VE","VF","VG","VH","VI","VJ","VK","VL","VM","VN","VO","VP","VQ","VR","VS","VT","VU","VV","VW","VX","VY","VZ","WA","WB","WC","WD","WE","WF","WG","WH","WI","WJ","WK","WL","WM","WN","WO","WP","WQ","WR","WS","WT","WU","WV","WW","WX","WY","WZ","XA","XB","XC","XD","XE","XF","XG","XH","XI","XJ","XK","XL","XM","XN","XO","XP","XQ","XR","XS","XT","XU","XV","XW","XX","XY","XZ","YA","YB","YC","YD","YE","YF","YG","YH","YI","YJ","YK","YL","YM","YN","YO","YP","YQ","YR","YS","YT","YU","YV","YW","YX","YY","YZ","ZA","ZB","ZC","ZD","ZE","ZF","ZG","ZH","ZI","ZJ","ZK","ZL","ZM","ZN","ZO","ZP","ZQ","ZR","ZS","ZT","ZU","ZV","ZW","ZX","ZY","ZZ"};
    try{
      //outputColorCodes(selectionSort(getLetters(pathStudents)));
        
        outputColorCodes(letters, validateJOptionPane("initials", 0));
        displayMessage("Generating");
      
        displayMessage("Generated");
    }
    catch(Exception e){
		System.out.println("Error in main.");
	}
  }
  
  public static String[] getLetters(String path) throws FileNotFoundException,
  IOException{
    BufferedReader br = new BufferedReader(new FileReader(new File(path)));
    String line; 
    Scanner scan = null; 
    int count=0;
    while((line = br.readLine()) !=null){
      count++;
    }
    
    br = new BufferedReader(new FileReader(new File(path)));
    String init;
    String[] toReturn = new String[count];
    int i=0;
    while((line = br.readLine()) !=null){
      scan =new Scanner(line);
      scan.useDelimiter(" ");
      init = scan.next(); 
      toReturn[i++]=init;
    }
    scan.close();
    return toReturn;  
  }
  
  public static void outputColorCodes(String[] letters, String initials){
    try{
    PrintWriter writer = new PrintWriter("Letters.txt", "UTF-8");
    
    for(int i=0; i < letters.length; i++){
      
        writer.println(initials+letters[i]);
    }
    writer.close();
    }catch(Exception e){
      displayMessage("Error at outputColorCodes");
    }
  }
  
  public static void prt(String prt)
  {
    displayMessage(prt);
  }
  
  /**
     * validates JOptionPane input
     * 
     * @param variableName
     * @param dataTypeFlag 0 - String type, 1 - int type, 2 - double type
     * @return
     */
    private static String validateJOptionPane(String variableName, int dataTypeFlag)
    {
        int variableFlag = 1;
        String stringToBeObtained = "";
        
        while(variableFlag==1)
        {
            try
            {
                if(variableName.equals("position rank"))
                {
                    stringToBeObtained = JOptionPane.showInputDialog( 
                            null, 
                            "Please choose your position:\n"
                                    + "1. Full Professor\n"
                                    + "2. Associate Professor\n"
                                    + "3. Assitant Professor\n"
                                    + "4. Others\n", 
                            "Unique Color Code Generator",
                            JOptionPane.QUESTION_MESSAGE
                            );
                }
                else
                {
                    stringToBeObtained = JOptionPane.showInputDialog( 
                            null, 
                            "Please enter your " + variableName + ":\n",
                            "Unique Color Code Generator",
                            JOptionPane.QUESTION_MESSAGE
                            );
                }
                
                if(!stringToBeObtained.isEmpty() && stringToBeObtained!=null)
                {
                    if(dataTypeFlag==1)
                    {
                        int intToBeObtained = Integer.parseInt(stringToBeObtained);
                        stringToBeObtained = String.valueOf(intToBeObtained); 
                    }
                    else if(dataTypeFlag==2)
                    {
                        double doubleToBeObtained = Double.parseDouble(stringToBeObtained);
                        stringToBeObtained = String.valueOf(doubleToBeObtained);
                    }
                    variableFlag=0;
                }
                else
                    JOptionPane.showMessageDialog( 
                            null, 
                            "Sorry! The " + variableName +" was invalid. Please enter it again.\n",
                            "Unique Color Code Generator",
                            JOptionPane.ERROR_MESSAGE
                        );
                
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog( 
                        null, 
                        "Sorry! Numeric values only.\n",
                        "Unique Color Code Generator",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
        
        return stringToBeObtained;
    }
    public static void displayMessage(String message)
    {
        JOptionPane.showMessageDialog(null, 
                message,
                "Unique Color Code Generator",
                JOptionPane.INFORMATION_MESSAGE);
    }
}