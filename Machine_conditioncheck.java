import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import javax.swing.*;
import java.awt.event.*;
public class Machine_conditioncheck
{
    public
    Machine_conditioncheck() {
        JFrame fr = new JFrame("Machine Condition");
        fr.setLayout(null);
        fr.setSize(600,500);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        JLabel la = new JLabel("Your Name :");
        la.setBounds(10,10,100,20);
        JTextField jtff = new JTextField();
        jtff.setBounds(130,10,150,20);    
        JLabel lao = new JLabel("ID Number :");
        lao.setBounds(10,30,90,20);
        JTextField jtfo = new JTextField();
        jtfo.setBounds(130,30,50,20);     
        JLabel laoo = new JLabel("Shift :");
        laoo.setBounds(10,50,60,20);
        JTextField jtflaoo = new JTextField();
        jtflaoo.setBounds(130,50,60,20); 
        JLabel lath = new JLabel(" MachinePressor :");//this is the parameter
        lath.setBounds(10,70,150,20);
        //First check box
        JCheckBox cbbgg = new JCheckBox();
        cbbgg.setBounds(130,95,20,20);
        JLabel jcbla = new JLabel("10 PSI");
        jcbla.setBounds(160,95,50,20);
        //Second checkbox
        JCheckBox jcblaat = new JCheckBox();
        jcblaat.setBounds(130,120,20,20);
        JLabel jcblaa = new JLabel("20 PSI");
        jcblaa.setBounds(160,120,50,20);
        //Third check box
        JCheckBox jcblas = new JCheckBox();
        jcblas.setBounds(130,140,20,20);
        JLabel jlass = new JLabel("30 PSI");
        jlass.setBounds(160,140,50,20);
        JLabel mv = new JLabel("MachineVoltage :");//Second parameter
        mv.setBounds(10,170,150,20);
        //first circul button
        JRadioButton jrbmv = new JRadioButton();
        jrbmv.setBounds(130,190,20,20);
        JLabel mvla = new JLabel("1 V");
        mvla.setBounds(160,190,30,20);  
        //second circul button
        JRadioButton jrbmvv = new JRadioButton();
        jrbmvv.setBounds(130,210,20,20);
        JLabel mvlav = new JLabel("2 V");
        mvlav.setBounds(160,210,30,20);
        JLabel mc = new JLabel("MachineProbleam :");//Third parameter
        mc.setBounds(10,230,150,20);
        JTextArea jtfmc = new JTextArea();
        jtfmc.setBounds(130,250,450,100);
        jtfmc.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
         //save button if you pressed
        JButton bu = new JButton("Save"); 
        bu.setBounds(400,430,80,20);
        bu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){ 
                try{
                    File file = new File("/home/g/Desktop/"+jtff.getText()+"_Signed"+".txt");///home/g/Desktop
                    boolean ch = file.exists();
                    if(ch == true)
                    {
                        JOptionPane.showMessageDialog(fr,"Machine Check list Signed\nContinue Your Work");
                    }
                    else{
                        file.createNewFile();
                    }
                    boolean chs=file.exists();
                    if(chs==true){
                        FileWriter fw = new FileWriter(file);
                        fw.write("Name     :");
                        fw.write(jtff.getText()+"\n");
                        fw.write("ID Number:");
                        fw.write(jtfo.getText()+"\n");
                        fw.write("Shift    : ");
                        fw.write(jtflaoo.getText()+"\n"+"\n");                      
                        if(cbbgg.isSelected()){
                            fw.write("Measion pressor :"+"10 psi"+"\n"+"\n");
                        }
                        if(jcblaat.isSelected()){
                            fw.write("Machine Pressor :"+"20 PSI"+"\n"+"\n");
                        }
                        if(jcblas.isSelected()){
                            fw.write("Machine Pressor :"+"30 PSI"+"\n"+"\n");
                        }
                        fw.write("Machine Voltage :"+"\n");
                        if(jrbmv.isSelected()){
                            fw.write("1 V"+"\n"+"\n");     
                        }
                        if(jrbmvv.isSelected()){
                            fw.write("2 V"+"\n"+"\n");
                        }                    
                        fw.write("Machine Probleam :"+"\n");
                        fw.write(jtfmc.getText());
                        fw.close();
                        fr.dispose();
                    }                   
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(fr," error");
                    e.printStackTrace();
                }              
            }
        });        
        fr.add(bu);fr.add(mc);fr.add(jtfmc);fr.add(jrbmvv);fr.add(mvlav);fr.add(jrbmv);fr.add(mvla);fr.add(mv); fr.add(jcblas);fr.add(jlass);fr.add(jcblaat);fr.add(lath);fr.add(jcbla);fr.add(jcblaa);fr.add(cbbgg);fr.add(laoo);
        fr.add(jtflaoo);fr.add(lath);fr.add(la);fr.add(jtff);fr.add(lao);fr.add(jtfo);
        fr.setVisible(true);   
    }
    public static void main(String args[])
    {
    
        new Machine_conditioncheck();
    }
}
