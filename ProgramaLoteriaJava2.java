import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ProgramaLoteriaJava2 extends JFrame
{
    JButton SortearNumero,Sair;
    JLabel LabelTitulo,LabelNumeros;
    JLabel [] LabelResultados  = new JLabel[20];
    JTextField [] TextResultado = new JTextField[10];
    JSeparator Separator1;
    JPanel PanelTela,PanelResultado,PanelSorteio;
    ButtonHandler handler = new ButtonHandler();
    public static void main (String args[])
    {
        ProgramaLoteriaJava2 XX = new ProgramaLoteriaJava2();
    }
    public ProgramaLoteriaJava2()
    {
        super("Programa Loteria");
        Container Tela = getContentPane();
        Tela.setLayout(new BorderLayout());
        
        
        
        PanelTela = new JPanel();                                       PanelTela.setLayout(null);                          Tela.add(BorderLayout.CENTER, PanelTela);
        
        
        
        SortearNumero = new JButton("Sortear");                         SortearNumero.setBounds(25,500,225,50);             PanelTela.add(SortearNumero);                      SortearNumero.setFont(new Font("Times New Roman",Font.BOLD,20));
        Sair = new JButton("Sair");                                     Sair.setBounds(250,500,225,50);                     PanelTela.add(Sair);                               Sair.setFont(new Font("Times New Roman",Font.BOLD,20));
        SortearNumero.addActionListener(handler);
        Sair.addActionListener(handler);                            
        
        Separator1 = new JSeparator();                                  Separator1.setBounds(25,490,450,50);                PanelTela.add(Separator1);
        
        LabelTitulo = new JLabel("           Loteria");                 LabelTitulo.setBounds(25,10,450,50);                PanelTela.add(LabelTitulo);                          LabelTitulo.setFont(new Font("Times New Roman",Font.BOLD,50));
        LabelNumeros = new JLabel("             Numeros sorteados:");   LabelNumeros.setBounds(25,100,450,50);              PanelTela.add(LabelNumeros);                         LabelNumeros.setFont(new Font("Times New Roman",Font.BOLD,30));
        
        PanelResultado = new JPanel();                                  PanelResultado.setLayout(null);                     PanelResultado.setBounds(25,160,450,70);             PanelTela.add(PanelResultado);
        LabelResultados[1] = new JLabel(" " + "**********************" + " ");    
        LabelResultados[1].setBounds(50,10,350,50);                     PanelResultado.add(LabelResultados[1]);             LabelResultados[1].setBorder(BorderFactory.createTitledBorder(""));
        
        PanelSorteio = new JPanel();                                    PanelSorteio.setLayout(null);                       PanelSorteio.setBounds(25,250,450,220);              PanelTela.add(PanelSorteio);
        LabelResultados[10] = new JLabel("Numero de Senas:");           LabelResultados[10].setBounds(50,60,180,30);        PanelSorteio.add(LabelResultados[10]);               LabelResultados[10].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[11] = new JLabel("  " + "*****" + "  ");        LabelResultados[11].setBounds(250,60,100,30);       PanelSorteio.add(LabelResultados[11]);               LabelResultados[11].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[12] = new JLabel("Numero de Quinas:");          LabelResultados[12].setBounds(50,100,180,30);       PanelSorteio.add(LabelResultados[12]);               LabelResultados[12].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[13] = new JLabel("  " + "*****" + "  ");        LabelResultados[13].setBounds(250,100,100,30);      PanelSorteio.add(LabelResultados[13]);               LabelResultados[13].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[14] = new JLabel("Numero de Quadras:");         LabelResultados[14].setBounds(50,140,180,30);       PanelSorteio.add(LabelResultados[14]);               LabelResultados[14].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[15] = new JLabel("  " + "*****" + "  ");        LabelResultados[15].setBounds(250,140,100,30);      PanelSorteio.add(LabelResultados[15]);               LabelResultados[15].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[16] = new JLabel("Resultados");                 LabelResultados[16].setBounds(40,10,200,30);        PanelSorteio.add(LabelResultados[16]);               LabelResultados[16].setFont(new Font("Times New Roman",Font.BOLD,30));
        
        
        LabelTitulo.setBorder(BorderFactory.createTitledBorder(""));
        LabelNumeros.setBorder(BorderFactory.createTitledBorder(""));
        PanelResultado.setBorder(BorderFactory.createTitledBorder(""));
        PanelSorteio.setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[1].setFont(new Font("Times New Roman",Font.BOLD,30));
        LabelResultados[10].setFont(new Font("Times New Roman",Font.BOLD,20));
        LabelResultados[12].setFont(new Font("Times New Roman",Font.BOLD,20));
        LabelResultados[14].setFont(new Font("Times New Roman",Font.BOLD,20));
        
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
    }
    String xz;
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == SortearNumero)
            {
                Random r = new Random();
                ArrayList<Integer> sorteio = new ArrayList<Integer>();
      
                for(int i=0;i<6;i++){
                    int temp = r.nextInt(60)+1;
                    if(sorteio.contains(temp)){i--;}
                    else{sorteio.add(temp);}
                }
                int nNumero = 6;
                int n4= 0, n5 =0, n6 =0;
                int conta = 0;
                int nJogos = 1000000;
                for(int i = 0; i < nJogos; i++){
                    ArrayList<Integer> jogo = new ArrayList<Integer>();
                    for(int x=0;x<nNumero;x++){
                        int temp = r.nextInt(60)+1;
                        if(jogo.contains(temp)){x--;}
                        else{jogo.add(temp);}
                    }
                    for(int x=0;x<nNumero;x++)
                    if(sorteio.contains(jogo.get(x))){
                        conta+=1;
                    }
                    if(conta == 6){n6 +=1;}
                    else if(conta == 5){n5 +=1;}
                    else if(conta == 4){n4 +=1;}
                    conta =0;
                    }
                xz=("    " + sorteio.toString() + "  ");
                LabelResultados[1].setText("" + xz + " ");
                LabelResultados[11].setText("" + n6 + " ");
                LabelResultados[13].setText("" + n5 + " ");
                LabelResultados[15].setText("" + n4 + " ");
            }
            else if(event.getSource() == Sair)
            {
                setVisible(false);
            }
        }
    }
}