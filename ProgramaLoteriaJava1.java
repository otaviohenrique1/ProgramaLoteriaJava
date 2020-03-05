import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ProgramaLoteriaJava1 extends JFrame
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
        ProgramaLoteriaJava1 XX = new ProgramaLoteriaJava1();
    }
    public ProgramaLoteriaJava1()
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
        
        PanelResultado = new JPanel();                                  PanelResultado.setLayout(null);                     PanelResultado.setBounds(25,160,450,120);            PanelTela.add(PanelResultado);
        LabelResultados[1] = new JLabel("  " + "*" + "  ");             LabelResultados[1].setBounds(50,40,50,50);          PanelResultado.add(LabelResultados[1]);              LabelResultados[1].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[2] = new JLabel("  " + "*" + "  ");             LabelResultados[2].setBounds(110,40,50,50);         PanelResultado.add(LabelResultados[2]);              LabelResultados[2].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[3] = new JLabel("  " + "*" + "  ");             LabelResultados[3].setBounds(170,40,50,50);         PanelResultado.add(LabelResultados[3]);              LabelResultados[3].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[4] = new JLabel("  " + "*" + "  ");             LabelResultados[4].setBounds(230,40,50,50);         PanelResultado.add(LabelResultados[4]);              LabelResultados[4].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[5] = new JLabel("  " + "*" + "  ");             LabelResultados[5].setBounds(290,40,50,50);         PanelResultado.add(LabelResultados[5]);              LabelResultados[5].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[6] = new JLabel("  " + "*" + "  ");             LabelResultados[6].setBounds(350,40,50,50);         PanelResultado.add(LabelResultados[6]);              LabelResultados[6].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[7] = new JLabel("Cartela de nº: ");             LabelResultados[7].setBounds(40,10,200,30);         PanelResultado.add(LabelResultados[7]);              LabelResultados[7].setFont(new Font("Times New Roman",Font.BOLD,20));
        LabelResultados[8] = new JLabel(" " + "xxxxxxx" + " ");         LabelResultados[8].setBounds(160,10,85,25);         PanelResultado.add(LabelResultados[8]);              LabelResultados[8].setFont(new Font("Times New Roman",Font.BOLD,20));
        LabelResultados[9] = new JLabel("acertou os numeros");          LabelResultados[9].setBounds(250,10,200,30);        PanelResultado.add(LabelResultados[9]);              LabelResultados[9].setFont(new Font("Times New Roman",Font.BOLD,20));
        
        PanelSorteio = new JPanel();                                    PanelSorteio.setLayout(null);                       PanelSorteio.setBounds(25,320,450,120);              PanelTela.add(PanelSorteio);
        LabelResultados[10] = new JLabel("  " + "*" + "  ");            LabelResultados[10].setBounds(50,40,50,50);         PanelSorteio.add(LabelResultados[10]);               LabelResultados[10].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[11] = new JLabel("  " + "*" + "  ");            LabelResultados[11].setBounds(110,40,50,50);        PanelSorteio.add(LabelResultados[11]);               LabelResultados[11].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[12] = new JLabel("  " + "*" + "  ");            LabelResultados[12].setBounds(170,40,50,50);        PanelSorteio.add(LabelResultados[12]);               LabelResultados[12].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[13] = new JLabel("  " + "*" + "  ");            LabelResultados[13].setBounds(230,40,50,50);        PanelSorteio.add(LabelResultados[13]);               LabelResultados[13].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[14] = new JLabel("  " + "*" + "  ");            LabelResultados[14].setBounds(290,40,50,50);        PanelSorteio.add(LabelResultados[14]);               LabelResultados[14].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[15] = new JLabel("  " + "*" + "  ");            LabelResultados[15].setBounds(350,40,50,50);        PanelSorteio.add(LabelResultados[15]);               LabelResultados[15].setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[16] = new JLabel("Numeros sorteados:");         LabelResultados[16].setBounds(40,10,200,30);        PanelSorteio.add(LabelResultados[16]);               LabelResultados[16].setFont(new Font("Times New Roman",Font.BOLD,20));
        
        
        LabelTitulo.setBorder(BorderFactory.createTitledBorder(""));
        LabelNumeros.setBorder(BorderFactory.createTitledBorder(""));
        PanelResultado.setBorder(BorderFactory.createTitledBorder(""));
        PanelSorteio.setBorder(BorderFactory.createTitledBorder(""));
        LabelResultados[1].setFont(new Font("Times New Roman",Font.BOLD,30));                    LabelResultados[10].setFont(new Font("Times New Roman",Font.BOLD,30));
        LabelResultados[2].setFont(new Font("Times New Roman",Font.BOLD,30));                    LabelResultados[11].setFont(new Font("Times New Roman",Font.BOLD,30));
        LabelResultados[3].setFont(new Font("Times New Roman",Font.BOLD,30));                    LabelResultados[12].setFont(new Font("Times New Roman",Font.BOLD,30));
        LabelResultados[4].setFont(new Font("Times New Roman",Font.BOLD,30));                    LabelResultados[13].setFont(new Font("Times New Roman",Font.BOLD,30));
        LabelResultados[5].setFont(new Font("Times New Roman",Font.BOLD,30));                    LabelResultados[14].setFont(new Font("Times New Roman",Font.BOLD,30));
        LabelResultados[6].setFont(new Font("Times New Roman",Font.BOLD,30));                    LabelResultados[15].setFont(new Font("Times New Roman",Font.BOLD,30));
        LabelResultados[8].setBorder(BorderFactory.createTitledBorder(""));
        
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
    }
    int i,l;
    long y1 = 0,y2 = 0,y3 = 0, y4 = 0,y5 = 0,y6 = 0;
    long x1 = 0,x2 = 0,x3 = 0,x4 = 0,x5 = 0,x6 = 0;
    long [] vetor = new long[6];
    Boolean numeroRepitido = false;
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == SortearNumero)
            {
                for( l = 1; l <=1; l ++)
                {   y1 = (1 + Math.round( Math.random() * 60 ) ); 
                    y2 = (1 + Math.round( Math.random() * 60 ) );
                    y3 = (1 + Math.round( Math.random() * 60 ) );
                    y4 = (1 + Math.round( Math.random() * 60 ) );
                    y5 = (1 + Math.round( Math.random() * 60 ) );
                    y6 = (1 + Math.round( Math.random() * 60 ) );
                    
                    for(int j = 0 ; j < vetor.length ; j ++){if(vetor[j]==y1){numeroRepitido = true;break;}}
                    if(numeroRepitido){l--;numeroRepitido= false;}else{vetor[0] = y1;}
                    for(int j = 0 ; j < vetor.length ; j ++){if(vetor[j]==y2){numeroRepitido = true;break;}}
                    if(numeroRepitido){l--;numeroRepitido= false;}else{vetor[1] = y2;}
                    for(int j = 0 ; j < vetor.length ; j ++){if(vetor[j]==y3){numeroRepitido = true;break;}}
                    if(numeroRepitido){l--;numeroRepitido= false;}else{vetor[2] = y3;}
                    for(int j = 0 ; j < vetor.length ; j ++){if(vetor[j]==y4){numeroRepitido = true;break;}}
                    if(numeroRepitido){l--;numeroRepitido= false;}else{vetor[3] = y4;}
                    for(int j = 0 ; j < vetor.length ; j ++){if(vetor[j]==y5){numeroRepitido = true;break;}}
                    if(numeroRepitido){l--;numeroRepitido= false;}else{vetor[4] = y5;}
                    for(int j = 0 ; j < vetor.length ; j ++){if(vetor[j]==y6){numeroRepitido = true;break;}}
                    if(numeroRepitido){l--;numeroRepitido= false;}else{vetor[5] = y6;}
                    
                    
                    
                }
                LabelResultados[10].setText(" " + y1 + " "); LabelResultados[11].setText(" " + y2 + " "); LabelResultados[12].setText(" " + y3 + " "); 
                LabelResultados[13].setText(" " + y4 + " "); LabelResultados[14].setText(" " + y5 + " "); LabelResultados[15].setText(" " + y6 + " ");
                for( i = 1; i <= 1000000; i ++)
                {   x1 = (1 + Math.round( Math.random() * 60 ) ); 
                    x2 = (1 + Math.round( Math.random() * 60 ) );
                    x3 = (1 + Math.round( Math.random() * 60 ) );
                    x4 = (1 + Math.round( Math.random() * 60 ) );
                    x5 = (1 + Math.round( Math.random() * 60 ) );
                    x6 = (1 + Math.round( Math.random() * 60 ) );
                    if(y1 == x1 || y1 == x2 || y1 == x3 || y1 == x4 || y1 == x5 || y1 == x6)
                    {if(y2 == x1 || y2 == x2 || y2 == x3 || y2 == x4 || y2 == x5 || y2 == x6)
                        {if(y3 == x1 || y3 == x2 || y3 == x3 || y3 == x4 || y3 == x5 || y3 == x6)
                            {if(y4 == x1 || y4 == x2 || y4 == x3 || y4 == x4 || y4 == x5 || y5 == x6)
                                {if(y5 == x1 || y5 == x2 || y5 == x3 || y5 == x4 || y5 == x5 || y5 == x6)
                                    {if(y6 == x1 || y6 == x2 || y6 == x3 || y6 == x4 || y6 == x5 || y6 == x6)
                                        {LabelResultados[8].setText(" " + i + " ");LabelResultados[1].setText(" " + x1 + " "); LabelResultados[2].setText(" " + x2 + " "); LabelResultados[3].setText(" " + x3 + " "); LabelResultados[4].setText(" " + x4 + " "); LabelResultados[5].setText(" " + x5 + " "); LabelResultados[6].setText(" " + x6 + " ");
                                     }
                                 }
                             }
                         }
                     }
                    }
                }
            }
            else if(event.getSource() == Sair){setVisible(false);}
        }
    }
}