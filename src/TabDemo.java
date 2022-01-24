/*
 * TabDemo.java
 *
 * Created on 2007. július 24., 10:23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Dr. Szlávik Szabolcs
 * e-mail: szlavikszabolcs@szlavikszabolcs.hu
 * https://www.szlavikszabolcs.hu/
 * City: Szeged
 * 
 */
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;
import java.awt.Dimension;
import javax.swing.JDialog;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

public class TabDemo implements ActionListener {
    Desktop desktop = null;
    //mnemonic
    char m = 'M';
    //az ábrák(képek) címei
    final String title1 = "1. ábra: Lactarius chrysorrheus (Agerer,1987)";
    final String title2 = "2. ábra: Suillus granulatus fenyőn (Szlávik, 2009)";
    final String title3 = "3. ábra: Cantharellus cibarius (Agerer,1987)";
    final String title4 = "4. ábra: Boletus edulis (Agerer,1987)";
    final String title5 = "5. ábra: Xerocomus badius (Agerer,1987)";
    final String title6 = "6. ábra: Tuber aestivum fenyőn (Szlávik,2007)";
    final String title7 = "7. ábra: A köpeny felszíne szögletes sejtekkel (Szlávik, 2007)";
    final String title8 = "8. ábra: A köpeny felszíne epidermoid sejtekkel (Szlávik, 2008)";
    final String title9 = "9. ábra: A köpeny felszíne gyapjas a cisztidiumoktól (Szlávik,2007)";
    final String title10 = "10. ábra: A köpeny felszíne szögletes sejtekkel (Szlávik, 2007)";
    final String title11 = "11. ábra: Elágazó cisztídium (Szlávik, 2008)";
    final String title12 = "12. ábra: Ár alakú cisztídium (DEEMY, 2007)";
    final String title13 = "13. ábra: A fehér szarvasgomba (Choiromyces spp.) mikorrhizája (Szlávik, 2009)";
    final String title14 = "14. ábra: A homoki szarvasgomba jellegzetes gombaelemei akác gyökérsejtekben (Bratek, 2009)";
    final String title15 = "15. ábra: A téli szarvasgomba sárgás színű cisztídiumai (Szlávik, 2008)";

    // képek betöltése
    ImageIcon pic1 = createImageIcon("DSCN2964.jpg");
    ImageIcon pic2 = createImageIcon("P1010025.JPG");
    ImageIcon pic3 = createImageIcon("Cantharellus.jpg");
    ImageIcon pic4 = createImageIcon("DSCN2404.jpg");
    ImageIcon pic5 = createImageIcon("Xerocomus badius.jpg");
    ImageIcon pic6 = createImageIcon("P1010009.jpg");
    
    //for card2/a
    ImageIcon pic7 = createImageIcon("P1010013.JPG");
    ImageIcon pic8 = createImageIcon("P1010004.JPG");
    
    //for card2/b
    ImageIcon pic9 = createImageIcon("P1010007.JPG");
    ImageIcon pic10 = createImageIcon("P1010013.JPG");
    
    //for card2/d
    ImageIcon pic11 = createImageIcon("P5160107.JPG");
    ImageIcon pic12 = createImageIcon("D-0153.gif");

    //for card4 and 2
    ImageIcon pic13 = createImageIcon("P1010161.JPG");
    ImageIcon pic14 = createImageIcon("DSC_0027.JPG");
    ImageIcon pic15 = createImageIcon("P5160115.JPG");

    JLabel picLabel = new JLabel(pic1);
    JLabel picLabel2 = new JLabel(pic2);
    JLabel picLabel3 = new JLabel(pic3);
    JLabel picLabel4 = new JLabel(pic4);
    JLabel picLabel5 = new JLabel(pic5);
    JLabel picLabel6 = new JLabel(pic6);
    
    //for card2/a
    JLabel picLabel7 = new JLabel(pic7);
    JLabel picLabel8 = new JLabel(pic8);
    
    //for card2/b
    JLabel picLabel9 = new JLabel(pic9);
    JLabel picLabel10 = new JLabel(pic10);
    
    //for card2/d
    JLabel picLabel11 = new JLabel(pic11);
    JLabel picLabel12 = new JLabel(pic12);

    //for card4 and 2
    JLabel picLabel13 = new JLabel(pic13);
    JLabel picLabel14 = new JLabel(pic14);
    JLabel picLabel15 = new JLabel(pic15);

    JScrollPane scrollPic1 = new JScrollPane(picLabel);
    JScrollPane scrollPic2 = new JScrollPane(picLabel2);
    JScrollPane scrollPic3 = new JScrollPane(picLabel3);
    JScrollPane scrollPic4 = new JScrollPane(picLabel4);
    JScrollPane scrollPic5 = new JScrollPane(picLabel5);
    JScrollPane scrollPic6 = new JScrollPane(picLabel6);
    
    //for card2/a
    JScrollPane scrollPic7 = new JScrollPane(picLabel7);
    JScrollPane scrollPic8 = new JScrollPane(picLabel8);
    
    //for card2/b
    JScrollPane scrollPic9 = new JScrollPane(picLabel9);
    JScrollPane scrollPic10 = new JScrollPane(picLabel10);
    
    //for card2/c
    JScrollPane scrollPic11 = new JScrollPane(picLabel11);
    JScrollPane scrollPic12 = new JScrollPane(picLabel12);

    //for card4 and 2
    JScrollPane scrollPic13 = new JScrollPane(picLabel13);
    JScrollPane scrollPic14 = new JScrollPane(picLabel14);
    JScrollPane scrollPic15 = new JScrollPane(picLabel15);

    PicPanel fp = new PicPanel(scrollPic1);
    PicPanel fp2 = new PicPanel(scrollPic2);
    PicPanel fp3 = new PicPanel(scrollPic3);
    PicPanel fp4 = new PicPanel(scrollPic4);
    PicPanel fp5 = new PicPanel(scrollPic5);
    PicPanel fp6 = new PicPanel(scrollPic6);
    
    //for card2/a
    PicPanel fp7 = new PicPanel(scrollPic7);
    PicPanel fp8 = new PicPanel(scrollPic8);
    
    //for card2/b
    PicPanel fp9 = new PicPanel(scrollPic9);
    PicPanel fp10 = new PicPanel(scrollPic10);
    
    //for card2/c
    PicPanel fp11 = new PicPanel(scrollPic11);
    PicPanel fp12 = new PicPanel(scrollPic12);

    //for card4

    PicPanel fp13 = new PicPanel(scrollPic13);
    PicPanel fp14 = new PicPanel(scrollPic14);
    PicPanel fp15 = new PicPanel(scrollPic15);

    // az ablak
    static JFrame frame;
    // panelek a tab-okhoz 
    JPanel pane = new JPanel();
    JPanel card1 = new JPanel(); 
    JPanel card2 = new JPanel(); 
    JPanel card3 = new JPanel(); 
    JPanel card4 = new JPanel(); 
    
    // panelek a tartalomhoz
    //for card1
    JPanel lactarius = new JPanel();       
    JPanel suillus = new JPanel();    
    JPanel cantharellus = new JPanel();       
    JPanel boletus = new JPanel();    
    JPanel taestivum = new JPanel();
    
    //for card2
    JPanel cantharellus2 = new JPanel();
    
    //for card2/a
    JPanel elag1 = new JPanel();
        
    //for card2/b
    JPanel taetolgy = new JPanel();
        
    //for card2/c
    JPanel elagazo = new JPanel();
    
    //for card3
    JPanel taemogy = new JPanel();
    JPanel angular = new JPanel();
    
    //for card4
    JPanel matirollo = new JPanel();
    
    
    //for card1
    JLabel delici = new JLabel("<html><b>1. </b>A mikorrhiza síma, <u>tejcsövektől</u> hálózatos, ha megsértjük, a termőtest tejnedvéhez hasonló színű cseppek buggyannak ki.</html>");
    JLabel ldlatin = new JLabel("<html><i>Lactarius sp.</html>");
    JLabel ldhun = new JLabel("<html><b>Tejelőgombák</html>");
    JLabel granu = new JLabel("<html><b>2. </b> A mikorrhiza <u>fehér</u> színű, <u>dichotomikus</u> elágazású.</html>");
    JLabel sglatin = new JLabel("<html><i>Suillus granulatus </html>");
    JLabel sghun = new JLabel("<html><b>Szemcsésnyelű fenyőtinóru</html>");
    JLabel cibar = new JLabel("<html><b>3. </b> A mikorrhiza színe <u>fehéres-okker, sárgás-okker, korall alakú,</u> a rizomorfák szőrözöttek.</html>");
    JLabel cclatin = new JLabel("<html><i>Cantharellus cibarius</html>");
    JLabel cchun = new JLabel("<html><b>Rókagomba</html>");
    JLabel barnal = new JLabel("<html><nobr><b>5. </b> A mikorrhiza színe <u>vöröses-barna, barnás-narancs.</html>");
    
    JLabel white = new JLabel("<html><nobr><b>4. </b> A mikorrhiza színe <u>fehér, felszíne ezüstös, monopodiális-piramidális</u><br> elágazású.</html>");
    JLabel aestivuml = new JLabel("<html><nobr><b>5a. </b> A mikorrhiza dichotomikus, a köpeny <u>gyapjas</u> a cisztidiumoktól és a felszíne<br> szögletes sejtekből áll.</html>");
    JLabel taehun = new JLabel("<html><b>Nyári szarvasgomba</html>");
    JLabel taelatin = new JLabel("<html><i>Tuber aestivum</html>");
    
    JLabel empty1 = new JLabel("-------------------");
    JLabel empty2 = new JLabel("-------------------");
    JLabel empty3 = new JLabel("-------------------");
    JLabel empty4 = new JLabel("-------------------");
    JLabel bole = new JLabel("<html><nobr><b>4a. </b> A mikorrhiza rendszer tengelye <u>csavarodott,</u> az el nem ágazó végződések <u>görbék,</u><br> a rizomorfa fehér, gyakran villásan csatlakozik a köpenyhez.</html>");
    JLabel belatin = new JLabel("<html><i>Boletus edulis</html>");
    JLabel behun = new JLabel("<html><b>Ízletes vargánya</html>");
    JLabel xero = new JLabel("<html><nobr><b>4b. </b> A mikorrhiza rendszer tengelye és az el nem ágazó végződések <u>egyenesek,</u><br> a rizomorfák fehérek.</html>");
    JLabel xblatin = new JLabel("<html><i>Xerocomus badius</html>");
    JLabel xbhun = new JLabel("<html><b>Barna tinóru</html>");
    
    //for card2
    JLabel cibar2 = new JLabel("<html><b>1. </b> A mikorrhiza színe <u>fehéres-okker, sárgás-okker, korall alakú,</u> a rizomorfák <u>szőrözöttek.</u></html>");
    JLabel cclatin2 = new JLabel("<html><i>Cantharellus cibarius</html>");
    JLabel cchun2 = new JLabel("<html><b>Rókagomba</html>");
    JLabel barnad2 = new JLabel("<html><nobr><b>3. </b> A mikorrhiza színe <u>vöröses-barna, barnás-narancs,</u> a köpeny ár alakú<br> cisztidumokkal</html>");
    JLabel bole2 = new JLabel("<html><html><b>2. </b> A mikorrhiza színe <u>fehér, felszíne ezüstös, monopodiális-piramidális</u> elágazású. A mikorrhiza rendszer tengelye csavarodott, az el nem ágazó végződések görbék, a rizomorfa fehér, gyakran villásan csatlakozik a köpenyhez.</html>");
    JLabel belatin2 = new JLabel("<html><i>Boletus edulis</html>");
    JLabel behun2 = new JLabel("<html><b>Ízletes vargánya");
    JLabel empty5 = new JLabel("-------------------");
    JLabel empty6 = new JLabel("-------------------");
    JLabel choirolatin = new JLabel("<html><i>Choiromyces spp.</html>");
    JLabel choirohun = new JLabel("<html><b>Fehér szarvasgomba");
    JLabel choiro = new JLabel("<html><b>4.");

    //for card2/a
    JLabel szog = new JLabel("<html><nobr><b>3a. </b> A köpeny felszíne <u>szögletes</u> sejtekkel.</html>");
    JLabel epi = new JLabel("<html><nobr><b>3b. </b> A köpeny felszíne <u>epidermoid</u> sejtekkel.</html>");
    JLabel empty7 = new JLabel("-------------------");
    JLabel empty8 = new JLabel("-------------------");
        
    //for card2/b
    JLabel taehun2 = new JLabel("<html><b>Nyári szarvasgomba</html>");
    JLabel taelatin2 = new JLabel("<html><i>Tuber aestivum</html>");
    JLabel aestivum2 = new JLabel("<html><nobr><b>1a. </b>A köpeny <u>gyapjas</u> a cisztídiumoktól (9. ábra). A <u>nem elágazó</u> cisztidiumok<br> hossza általában <u>300-800µm</u> (10. ábra).</html>");
    JLabel tmesen = new JLabel("<html><nobr><font color=gray><b>1b. </b>A cisztídium középső részén <u>elágazódások.</u> A cisztídium hossza <u>1200µm,</u><br> vagy még hosszabb.<html>");
    JLabel tmeshun = new JLabel("<html><font color=gray><b>Kátrányszagú szarvasgomba</b></html>");
    JLabel tmeslatin = new JLabel("<html><font color=gray><i> Tuber mesentericum</i></html>");
    
    //for card2/c
    JLabel elagazol = new JLabel("<html><nobr><b>3c. </b>A cisztídium <u>elágazó,</u> középső része vastagabb.</html>");    
    JLabel nemelagazol = new JLabel("<html><nobr><b>3d. </b>A cisztídium <u>nem elágazó,</u> vastag és sárga.<br> Az alapi átmérője(3,2)-4,3-(6)µm.</html>");     
        
    JLabel tmacrohun = new JLabel("<html><b>Nagyspórás szarvasgomba</html>");
    JLabel tmacrolatin = new JLabel("<html><i>Tuber macrosporum</html>");       
    
    JLabel tbrumhun = new JLabel("<html><b>Téli szarvasgomba</html>");
    JLabel tbrumlatin = new JLabel("<html><i>Tuber brumale</html>");
    
    //for card3
    JLabel taehun3 = new JLabel("<html><b>Nyári szarvasgomba</html>");
    JLabel taelatin3 = new JLabel("<html><i>Tuber aestivum</html>");
    JLabel aestivum3 = new JLabel("<html><nobr><b>1a. </b>A köpeny <u>gyapjas</u> a cisztídiumoktól (9. ábra). A nem elágazó cisztidiumok<br> hossza általában <u>300-800µm</u> (10. ábra).</html>");
    JLabel szog2 = new JLabel("<html><nobr><b>1. </b>A köpeny felszíne <u>szögletes</u> sejtekkel, a cisztídiumok ár</u> alakúak.</html>");
    JLabel epi2 = new JLabel("<html><nobr><b>2. </b>A köpeny felszíne <u>epidermoid</u> sejtekkel, a cisztídiumok <u>hiányoznak</u><br> vagy <u>fa</u> alakúak.</html>");
    JLabel empty10 = new JLabel("------------------");
    JLabel empty11 = new JLabel("------------------");
    JLabel empty12 = new JLabel("------------------");
    JLabel empty13 = new JLabel("------------------");
    JLabel tmesen2 = new JLabel("<html><nobr><font color=gray><b>1b. </b>A cisztídium középső részén <u>elágazódások.</u> A cisztídium hossza <u>1200µm,</u><br> vagy még hosszabb.<html>");
    JLabel tmeshun2 = new JLabel("<html><font color=gray><b>Kátrányszagú szarvasgomba</b></html>");
    JLabel tmeslatin2 = new JLabel("<html><font color=gray><i> Tuber mesentericum</i></html>");
    
    //for card4
    JLabel terfezoideshun = new JLabel("<html><b>Homoki szarvasgomba</html>");
    JLabel terfezoideslatin = new JLabel("<html><i>Mattirolomyces terfezioides</html>");
    JLabel matterf = new JLabel("<html><nobr><b>1. </b>Ektendo mikorrhiza. A köpeny <u>fejletlen</u>. Hartig-háló megtalálható.<br> <u>Intracelluláris</u> hifák is vannak.</html>");
    JLabel empty9 = new JLabel("");
    
    //spacers!!
    //card1/a
    JLabel empty14 = new JLabel("FILLER.");
    JLabel empty15 = new JLabel("FILLER.");
    JLabel empty16 = new JLabel("FILLER.");
    JLabel empty17 = new JLabel("FILLER.");
    JLabel empty18 = new JLabel("FILLER.");
    JLabel empty19 = new JLabel("FILLER.");
    JLabel empty20 = new JLabel("FILLER.");
    JLabel empty21 = new JLabel("FILLER.");    
    JLabel empty22 = new JLabel("FILLER.");
    JLabel empty23 = new JLabel("FILLER.");
    JLabel empty24 = new JLabel("FILLER.");
    //card1/b
    JLabel empty25 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty26 = new JLabel("FILLER.");
    JLabel empty27 = new JLabel("FILLER.");
    JLabel empty28 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty29 = new JLabel("FILLER.");
    JLabel empty30 = new JLabel("FILLER.");
    JLabel empty31 = new JLabel("FILLER.");
    JLabel empty32 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty33 = new JLabel("FILLER.");
    JLabel empty34 = new JLabel("FILLER.");
    JLabel empty35 = new JLabel("FILLER.");
    JLabel empty36 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty37 = new JLabel("FILLER.");
    JLabel empty38 = new JLabel("FILLER.");
    JLabel empty39 = new JLabel("FILLER.");
    //card2
    JLabel empty40 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty41 = new JLabel("FILLER.");
    JLabel empty42 = new JLabel("FILLER.");
    JLabel empty43 = new JLabel("FILLER.");
    JLabel empty44 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty45 = new JLabel("FILLER.");
    JLabel empty46 = new JLabel("FILLER.");
    JLabel empty47 = new JLabel("FILLER.");
    //card2/a
    JLabel empty48 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");    
    JLabel empty49 = new JLabel("FILLER.");
    JLabel empty50 = new JLabel("FILLER.");
    JLabel empty51 = new JLabel("FILLER.");
    JLabel empty52 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty53 = new JLabel("FILLER.");
    JLabel empty54 = new JLabel("FILLER.");
    JLabel empty55 = new JLabel("FILLER.");
    JLabel empty56 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty57 = new JLabel("FILLER.");
    JLabel empty58 = new JLabel("FILLER.");
    JLabel empty59 = new JLabel("FILLER.");
    //card2/b
    JLabel empty60 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty61 = new JLabel("FILLER.");
    JLabel empty62 = new JLabel("FILLER.");
    JLabel empty63 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty64 = new JLabel("FILLER.");
    JLabel empty65 = new JLabel("FILLER.");
    JLabel empty66 = new JLabel("FILLER.");
    JLabel empty67 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty68 = new JLabel("FILLER.");
    JLabel empty69 = new JLabel("FILLER.");
    JLabel empty70 = new JLabel("FILLER.");
    //card3
    JLabel empty71 = new JLabel("FILLER.");
    JLabel empty72 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty73 = new JLabel("FILLER.");
    JLabel empty74 = new JLabel("FILLER.");
    JLabel empty75 = new JLabel("FILLER.");
    JLabel empty76 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty77 = new JLabel("FILLER.");
    JLabel empty78 = new JLabel("FILLER.");
    JLabel empty79 = new JLabel("FILLER.");
    JLabel empty80 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty81 = new JLabel("FILLER.");
    JLabel empty82 = new JLabel("FILLER.");
    //card3/a
    JLabel empty83 = new JLabel("FILLER.");
    JLabel empty84 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty85 = new JLabel("FILLER.");
    JLabel empty86 = new JLabel("FILLER.");
    JLabel empty87 = new JLabel("FILLER.");
    JLabel empty88 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty89 = new JLabel("FILLER.");
    JLabel empty90 = new JLabel("FILLER.");
    JLabel empty91 = new JLabel("FILLER.");
    JLabel empty92 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty93 = new JLabel("FILLER.");    
    JLabel empty94 = new JLabel("FILLER.");
    JLabel empty95 = new JLabel("FILLER.");   
    //card3/a
    JLabel empty96 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty97 = new JLabel("FILLER.");
    JLabel empty98 = new JLabel("FILLER.");
    JLabel empty99 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty100 = new JLabel("FILLER.");
    JLabel empty101 = new JLabel("FILLER.");
    JLabel empty102 = new JLabel("FILLER.");
    JLabel empty103 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty104 = new JLabel("FILLER.");
    JLabel empty105 = new JLabel("FILLER.");
    JLabel empty106 = new JLabel("FILLER.");
    //card4
    JLabel empty107 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty108 = new JLabel("FILLER.");
    JLabel empty109 = new JLabel("FILLER.");
    JLabel empty110 = new JLabel("FILLER.");
    JLabel empty111 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty112 = new JLabel("FILLER.");
    JLabel empty113 = new JLabel("FILLER.");
    JLabel empty114 = new JLabel("FILLER.");
    JLabel empty115 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty116 = new JLabel("FILLER.");
    JLabel empty117 = new JLabel("FILLER.");
    JLabel empty118 = new JLabel("FILLER.");
    JLabel empty119 = new JLabel("2. A köpenyből kiágazó hifák között ún. Suillus kristályok láthatóak.");
    JLabel empty120 = new JLabel("FILLER.");
    JLabel empty121 = new JLabel("FILLER.");
    JLabel empty122 = new JLabel("FILLER.");
    
    Border outer = BorderFactory.createEtchedBorder();
    Border inner = BorderFactory.createEmptyBorder(10,10,10,10);
    
    JButton button1 = new JButton("1. ábra");
    JButton button2 = new JButton("2. ábra");
    JButton button3 = new JButton("3. ábra");
    JButton button4 = new JButton("Tovább");
    JButton button5 = new JButton("Tovább");
    JButton button6 = new JButton("4. ábra");
    JButton button7 = new JButton("5. ábra");
    JButton button8 = new JButton("6. ábra");
    JButton button9 = new JButton("Vissza");
    JButton button10 = new JButton("Vissza");
    
    // for card2
    JButton button11 = new JButton("3. ábra");
    JButton button12 = new JButton("4. ábra");
    JButton button13 = new JButton("Tovább");
    JButton button29 = new JButton("13. ábra");

    //for card2/a
    JButton button14 = new JButton("Tovább");
    JButton button15 = new JButton("Tovább");
    JButton button16 = new JButton("7. ábra");
    JButton button17 = new JButton("8. ábra");
    
    //for card2/b
    JButton button18 = new JButton("9. ábra");
    JButton button19 = new JButton("10. ábra");
    JButton button20 = new JButton("Vissza");
    JButton button20b = new JButton("Vissza");
    
    //for card2/c
    JButton button21 = new JButton("11. ábra");
    JButton button22 = new JButton("12. ábra");
    JButton button30 = new JButton("15. ábra");

    //for card3
    JButton button23 = new JButton("9. ábra");
    JButton button24 = new JButton("10. ábra");
    JButton button25 = new JButton("Tovább");
    JButton button26 = new JButton("Tovább");
    JButton button27 = new JButton("Vissza");

    //for card4
    JButton button28 = new JButton("14. ábra");

    GridLayout layout1 = new GridLayout(1, 1, 10, 10);
    GridBagLayout layout2 = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
        
    /** Creates a new instance of TabDemo */
    public TabDemo(JFrame frame) {
    this.frame = frame;
    }
    
    public JMenuBar createMenuBar() {
        JMenuBar menusor = new JMenuBar();
        JMenu menu1 = new JMenu("Menü");
        JMenuItem almenu1 = new JMenuItem("Irodalom");
        JMenuItem almenu2 = new JMenuItem("Névjegy");    
        JMenuItem almenu3 = new JMenuItem("Tipp");      
        JMenuItem almenu4 = new JMenuItem("Kilépés");
        menusor.add(menu1);
        
        menu1.setMnemonic(m);
        menu1.add(almenu3).addActionListener(this);
        menu1.add(almenu1).addActionListener(this);
        menu1.add(almenu2).addActionListener(this);
        menu1.addSeparator();
        menu1.add(almenu4).addActionListener(this);
     
        return menusor;        
        }        
    
    public void addComponentToPane(Container pane) {
          
    
        
        JTabbedPane tabbedPane = new JTabbedPane();

        //Create the "cards".
        //Card1
        
        card1.setLayout(layout1);        
        card1.setBorder(BorderFactory.createCompoundBorder(outer, inner));  
               
        lactarius.setLayout(layout2);
        lactarius.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        lactarius.add(delici,c);
        
        c.gridx = 1;
        c.gridy = 0;
        lactarius.add(ldhun,c);
        c.gridx = 2;
        c.gridy = 0;
        lactarius.add(ldlatin,c);
        c.gridx = 3;
        c.gridy = 0;
        
        lactarius.add(button1,c);
        button1.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
        lactarius.add(granu,c);
        c.gridx = 1;
        c.gridy = 1;

        lactarius.add(sghun,c);
        c.gridx = 2;
        c.gridy = 1;

        lactarius.add(sglatin,c);
        c.gridx = 3;
        c.gridy = 1;

        lactarius.add(button2,c);
        button2.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        lactarius.add(cibar,c);
        c.gridx = 1;
        c.gridy = 2;
        lactarius.add(cchun,c);
        c.gridx = 2;
        c.gridy = 2;
        lactarius.add(cclatin,c);
        c.gridx = 3;
        c.gridy = 2;
        lactarius.add(button3,c);
        button3.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        lactarius.add(white,c);
        c.gridx = 1;
        c.gridy = 3;
        lactarius.add(empty1,c);
        c.gridx = 2;
        c.gridy = 3;
        lactarius.add(empty2,c);
        c.gridx = 3;
        c.gridy = 3;
        lactarius.add(button4,c);
        button4.addActionListener(this);
       
        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        lactarius.add(barnal,c);
        c.gridx = 1;
        c.gridy = 4;
        lactarius.add(empty3,c);
        c.gridx = 2;
        c.gridy = 4;
        lactarius.add(empty4,c);
        c.gridx = 3;
        c.gridy = 4;
        lactarius.add(button5,c);
        button5.addActionListener(this);
        card1.add(lactarius);
        
        
        
        //card1(a)
        
        boletus.setLayout(layout2);
        boletus.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        boletus.add(bole,c);
        
        c.gridx = 1;
        c.gridy = 0;
        boletus.add(behun,c);
        c.gridx = 2;
        c.gridy = 0;
        boletus.add(belatin,c);
        c.gridx = 3;
        c.gridy = 0;
        
        boletus.add(button6,c);
        button6.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
        boletus.add(xero,c);
        c.gridx = 1;
        c.gridy = 1;

        boletus.add(xbhun,c);
        c.gridx = 2;
        c.gridy = 1;

        boletus.add(xblatin,c);
        c.gridx = 3;
        c.gridy = 1;

        boletus.add(button7,c);
        button7.addActionListener(this);
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        empty14.setForeground(card1.getBackground());
        boletus.add(empty14,c);
        c.gridx = 1;
        c.gridy = 2;
        empty15.setForeground(card1.getBackground());
        boletus.add(empty15,c);
        c.gridx = 2;
        c.gridy = 2;
        empty16.setForeground(card1.getBackground());
        boletus.add(empty16,c);
        c.gridx = 3;
        c.gridy = 2;
        
        boletus.add(button9,c);
                
        button9.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        empty17.setForeground(card1.getBackground());
        boletus.add(empty17,c);
        c.gridx = 1;
        c.gridy = 3;
        empty18.setForeground(card1.getBackground());
        boletus.add(empty18,c);
        c.gridx = 2;
        c.gridy = 3;
        empty19.setForeground(card1.getBackground());
        boletus.add(empty19,c);
        c.gridx = 3;
        c.gridy = 3;
        empty20.setForeground(card1.getBackground());
        boletus.add(empty20,c);
        
        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        empty21.setForeground(card1.getBackground());
        boletus.add(empty21,c);
        c.gridx = 1;
        c.gridy = 4;
        empty22.setForeground(card1.getBackground());
        boletus.add(empty22,c);
        c.gridx = 2;
        c.gridy = 4;
        empty23.setForeground(card1.getBackground());
        boletus.add(empty23,c);
        c.gridx = 3;
        c.gridy = 4;
        empty24.setForeground(card1.getBackground());
        boletus.add(empty24,c);
        
                
        //card1(b)
        taestivum.setLayout(layout2);
        taestivum.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                    
        
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        taestivum.add(aestivuml,c);
        
        c.gridx = 1;
        c.gridy = 0;
        taestivum.add(taehun,c);
        c.gridx = 2;
        c.gridy = 0;
        taestivum.add(taelatin,c);
        c.gridx = 3;
        c.gridy = 0;
        
        taestivum.add(button8,c);
        button8.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
        empty25.setForeground(card1.getBackground());
        taestivum.add(empty25,c);
        c.gridx = 1;
        c.gridy = 1;
        empty26.setForeground(card1.getBackground());
        taestivum.add(empty26,c);
        c.gridx = 2;
        c.gridy = 1;
        empty27.setForeground(card1.getBackground());
        taestivum.add(empty27,c);
        c.gridx = 3;
        c.gridy = 1;
        taestivum.add(button10,c);
        button10.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        empty28.setForeground(card1.getBackground());
        taestivum.add(empty28,c);
        c.gridx = 1;
        c.gridy = 2;
        empty29.setForeground(card1.getBackground());
        taestivum.add(empty29,c);
        c.gridx = 2;
        c.gridy = 2;
        empty30.setForeground(card1.getBackground());
        taestivum.add(empty30,c);
        c.gridx = 3;
        c.gridy = 2;
        empty31.setForeground(card1.getBackground());
        taestivum.add(empty31,c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        empty32.setForeground(card1.getBackground());
        taestivum.add(empty32,c);
        c.gridx = 1;
        c.gridy = 3;
        empty33.setForeground(card1.getBackground());
        taestivum.add(empty33,c);
        c.gridx = 2;
        c.gridy = 3;
        empty34.setForeground(card1.getBackground());
        taestivum.add(empty34,c);
        c.gridx = 3;
        c.gridy = 3;
        empty35.setForeground(card1.getBackground());
        taestivum.add(empty35,c);
        
        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        empty36.setForeground(card1.getBackground());
        taestivum.add(empty36,c);
        c.gridx = 1;
        c.gridy = 4;
        empty37.setForeground(card1.getBackground());
        taestivum.add(empty37,c);
        c.gridx = 2;
        c.gridy = 4;
        empty38.setForeground(card1.getBackground());
        taestivum.add(empty38,c);
        c.gridx = 3;
        c.gridy = 4;
        empty39.setForeground(card1.getBackground());
        taestivum.add(empty39,c);
        
                
        //card2
        
        card2.setLayout(layout1);        
        card2.setBorder(BorderFactory.createCompoundBorder(outer, inner));  
               
        cantharellus2.setLayout(layout2);
        cantharellus2.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        cantharellus2.add(cibar2,c);
        
        c.gridx = 1;
        c.gridy = 0;
        cantharellus2.add(cchun2,c);
        c.gridx = 2;
        c.gridy = 0;
        cantharellus2.add(cclatin2,c);
        c.gridx = 3;
        c.gridy = 0;
        
        cantharellus2.add(button11,c);
        button11.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
        cantharellus2.add(bole2,c);
        c.gridx = 1;
        c.gridy = 1;

        cantharellus2.add(behun2,c);
        c.gridx = 2;
        c.gridy = 1;

        cantharellus2.add(belatin2,c);
        c.gridx = 3;
        c.gridy = 1;

        cantharellus2.add(button12,c);
        button12.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        cantharellus2.add(barnad2,c);
        c.gridx = 1;
        c.gridy = 2;
        cantharellus2.add(empty5,c);
        c.gridx = 2;
        c.gridy = 2;
        cantharellus2.add(button22,c);
        c.gridx = 3;
        c.gridy = 2;
        cantharellus2.add(button13,c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        empty40.setForeground(card2.getBackground());
        cantharellus2.add(choiro,c);
        c.gridx = 1;
        c.gridy = 3;
        empty41.setForeground(card2.getBackground());
        cantharellus2.add(choirohun,c);
        c.gridx = 2;
        c.gridy = 3;
        empty42.setForeground(card2.getBackground());
        cantharellus2.add(choirolatin,c);
        c.gridx = 3;
        c.gridy = 3;
        empty43.setForeground(card2.getBackground());
        cantharellus2.add(button29,c);
        button29.addActionListener(this);

        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        empty44.setForeground(card2.getBackground());
        cantharellus2.add(empty44,c);
        c.gridx = 1;
        c.gridy = 4;
        c.anchor = GridBagConstraints.LAST_LINE_START;
        empty45.setForeground(card2.getBackground());
        cantharellus2.add(empty45,c);
        c.gridx = 2;
        c.gridy = 4;
        empty46.setForeground(card2.getBackground());
        cantharellus2.add(empty46,c);
        c.gridx = 3;
        c.gridy = 4;
        empty47.setForeground(card2.getBackground());
        cantharellus2.add(empty47,c);
        
        
        button22.addActionListener(this);
        button13.addActionListener(this);
        
        card2.add(cantharellus2);
       
        
        
        //card2/a
        
        elag1.setLayout(layout2);
        elag1.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        //ldlatin.setHorizontalAlignment(ldlatin.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        elag1.add(szog,c);
        
        c.gridx = 1;
        c.gridy = 0;
        elag1.add(empty7,c);
        c.gridx = 2;
        c.gridy = 0;
        elag1.add(button16,c);
        c.gridx = 3;
        c.gridy = 0;
        
        elag1.add(button14,c);
        
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
        elag1.add(epi,c);
        c.gridx = 1;
        c.gridy = 1;

        elag1.add(empty8,c);
        c.gridx = 2;
        c.gridy = 1;

        elag1.add(button17,c);
        c.gridx = 3;
        c.gridy = 1;

        elag1.add(button15,c);
        
        
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        empty48.setForeground(card2.getBackground());
        elag1.add(empty48,c);
        c.gridx = 1;
        c.gridy = 2;
        empty49.setForeground(card2.getBackground());
        elag1.add(empty49,c);
        c.gridx = 2;
        c.gridy = 2;
        empty50.setForeground(card2.getBackground());
        elag1.add(empty50,c);
        c.gridx = 3;
        c.gridy = 2;
        empty51.setForeground(card2.getBackground());
        elag1.add(empty51,c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        empty52.setForeground(card2.getBackground());
        elag1.add(empty52,c);
        c.gridx = 1;
        c.gridy = 3;
        empty53.setForeground(card2.getBackground());
        elag1.add(empty53,c);
        c.gridx = 2;
        c.gridy = 3;
        empty54.setForeground(card2.getBackground());
        elag1.add(empty54,c);
        c.gridx = 3;
        c.gridy = 3;
        empty55.setForeground(card2.getBackground());
        elag1.add(empty55,c);
        
        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        empty56.setForeground(card2.getBackground());
        elag1.add(empty56,c);
        c.gridx = 1;
        c.gridy = 4;
        
        empty57.setForeground(card2.getBackground());
        elag1.add(empty57,c);
        c.gridx = 2;
        c.gridy = 4;
        empty58.setForeground(card2.getBackground());
        elag1.add(empty58,c);
        c.gridx = 3;
        c.gridy = 4;
        empty59.setForeground(card2.getBackground());
        elag1.add(empty59,c); 
        
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        
        
        //card2/b
        taetolgy.setLayout(layout2);
        taetolgy.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        taetolgy.add(aestivum2,c);
        
        c.gridx = 1;
        c.gridy = 0;
        taetolgy.add(taehun2,c);
        c.gridx = 2;
        c.gridy = 0;
        taetolgy.add(taelatin2,c);
        c.gridx = 3;
        c.gridy = 0;
        
        taetolgy.add(button18,c);
        
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
        
        empty60.setForeground(card2.getBackground());
        taetolgy.add(empty60,c);
        c.gridx = 1;
        c.gridy = 1;
        
        empty61.setForeground(card2.getBackground());
        taetolgy.add(empty61,c);
        c.gridx = 2;
        c.gridy = 1;
        
        empty62.setForeground(card2.getBackground());
        taetolgy.add(empty62,c);
        c.gridx = 3;
        c.gridy = 1;

        taetolgy.add(button19,c);
        
        
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        
        taetolgy.add(tmesen,c);
        c.gridx = 1;
        c.gridy = 2;
        
        taetolgy.add(tmeshun,c);
        c.gridx = 2;
        c.gridy = 2;
        
        taetolgy.add(tmeslatin,c);
        c.gridx = 3;
        c.gridy = 2;
        
        taetolgy.add(button20,c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        empty63.setForeground(card2.getBackground());
        taetolgy.add(empty63,c);
        c.gridx = 1;
        c.gridy = 3;
        empty64.setForeground(card2.getBackground());
        taetolgy.add(empty64,c);
        c.gridx = 2;
        c.gridy = 3;
        empty65.setForeground(card2.getBackground());
        taetolgy.add(empty65,c);
        c.gridx = 3;
        c.gridy = 3;
        empty66.setForeground(card2.getBackground());
        taetolgy.add(empty66,c);
        
        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        empty67.setForeground(card2.getBackground());
        taetolgy.add(empty67,c);
        c.gridx = 1;
        c.gridy = 4;
        
        empty68.setForeground(card2.getBackground());
        taetolgy.add(empty68,c);
        c.gridx = 2;
        c.gridy = 4;
        empty69.setForeground(card2.getBackground());
        taetolgy.add(empty69,c);
        c.gridx = 3;
        c.gridy = 4;
        empty70.setForeground(card2.getBackground());
        taetolgy.add(empty70,c); 
        
        
        button18.addActionListener(this);
        button19.addActionListener(this);
        button20.addActionListener(this);
        
        //card2/c
        elagazo.setLayout(layout2);
        elagazo.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        elagazo.add(elagazol,c);
        
        c.gridx = 1;
        c.gridy = 0;
        elagazo.add(tmacrohun,c);
        c.gridx = 2;
        c.gridy = 0;
        elagazo.add(tmacrolatin,c);
        c.gridx = 3;
        c.gridy = 0;
        
        elagazo.add(button21,c);
        
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
               
        elagazo.add(nemelagazol,c);
        c.gridx = 1;
        c.gridy = 1;
        
        elagazo.add(tbrumhun,c);
        c.gridx = 2;
        c.gridy = 1;
                
        elagazo.add(tbrumlatin,c);
        c.gridx = 3;
        c.gridy = 1;

        elagazo.add(button30,c);
        
        
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        empty72.setForeground(card2.getBackground());
        elagazo.add(empty72,c);
        c.gridx = 1;
        c.gridy = 2;
        empty73.setForeground(card2.getBackground());
        elagazo.add(empty73,c);
        c.gridx = 2;
        c.gridy = 2;
        empty74.setForeground(card2.getBackground());
        elagazo.add(empty74,c);
        c.gridx = 3;
        c.gridy = 2;
        empty75.setForeground(card2.getBackground());
        elagazo.add(button20b,c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        empty76.setForeground(card2.getBackground());
        elagazo.add(empty76,c);
        c.gridx = 1;
        c.gridy = 3;
        empty77.setForeground(card2.getBackground());
        elagazo.add(empty77,c);
        c.gridx = 2;
        c.gridy = 3;
        empty78.setForeground(card2.getBackground());
        elagazo.add(empty78,c);
        c.gridx = 3;
        c.gridy = 3;
        empty79.setForeground(card2.getBackground());
        elagazo.add(empty79,c);
        
        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        empty80.setForeground(card2.getBackground());
        elagazo.add(empty80,c);
        c.gridx = 1;
        c.gridy = 4;
        
        empty81.setForeground(card2.getBackground());
        elagazo.add(empty81,c);
        c.gridx = 2;
        c.gridy = 4;
        empty82.setForeground(card2.getBackground());
        elagazo.add(empty82,c);
        c.gridx = 3;
        c.gridy = 4;
        empty83.setForeground(card2.getBackground());
        elagazo.add(empty83,c); 
        
        button21.addActionListener(this);
        button20b.addActionListener(this);
        button30.addActionListener(this);
        
        // card3
        card3.setLayout(layout1);        
        card3.setBorder(BorderFactory.createCompoundBorder(outer, inner));  
               
        angular.setLayout(layout2);
        angular.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        angular.add(szog2,c);
        
        c.gridx = 1;
        c.gridy = 0;
        angular.add(empty10,c);
        c.gridx = 2;
        c.gridy = 0;
        angular.add(empty11,c);
        c.gridx = 3;
        c.gridy = 0;
        
        angular.add(button25,c);
        button25.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
        angular.add(epi2,c);
        c.gridx = 1;
        c.gridy = 1;

        angular.add(empty12,c);
        c.gridx = 2;
        c.gridy = 1;

        angular.add(empty13,c);
        c.gridx = 3;
        c.gridy = 1;

        angular.add(button26,c);
        button26.setEnabled(false);
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        empty84.setForeground(card3.getBackground());
        angular.add(empty84,c);
        c.gridx = 1;
        c.gridy = 2;
        empty85.setForeground(card3.getBackground());
        angular.add(empty85,c);
        c.gridx = 2;
        c.gridy = 2;
        empty86.setForeground(card3.getBackground());
        angular.add(empty86,c);
        c.gridx = 3;
        c.gridy = 2;
        empty87.setForeground(card3.getBackground());
        angular.add(empty87,c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        empty88.setForeground(card3.getBackground());
        angular.add(empty88,c);
        c.gridx = 1;
        c.gridy = 3;
        empty89.setForeground(card3.getBackground());
        angular.add(empty89,c);
        c.gridx = 2;
        c.gridy = 3;
        empty90.setForeground(card3.getBackground());
        angular.add(empty90,c);
        c.gridx = 3;
        c.gridy = 3;
        empty91.setForeground(card3.getBackground());
        angular.add(empty91,c);
        
        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        empty92.setForeground(card3.getBackground());
        angular.add(empty92,c);
        c.gridx = 1;
        c.gridy = 4;
        
        empty93.setForeground(card3.getBackground());
        angular.add(empty93,c);
        c.gridx = 2;
        c.gridy = 4;
        empty94.setForeground(card3.getBackground());
        angular.add(empty94,c);
        c.gridx = 3;
        c.gridy = 4;
        empty95.setForeground(card3.getBackground());
        angular.add(empty95,c); 
        
        card3.add(angular);
             
        button23.addActionListener(this);
        button24.addActionListener(this);
        button27.addActionListener(this);
        //JPanel card3 = new JPanel(); //{
        
        //card3a
        taemogy.setLayout(layout2);
        taemogy.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        taemogy.add(aestivum3,c);
        
        c.gridx = 1;
        c.gridy = 0;
        taemogy.add(taehun3,c);
        c.gridx = 2;
        c.gridy = 0;
        taemogy.add(taelatin3,c);
        c.gridx = 3;
        c.gridy = 0;
        
        taemogy.add(button23,c);
        
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
        empty96.setForeground(card3.getBackground());
        taemogy.add(empty96,c);
        c.gridx = 1;
        c.gridy = 1;
        empty97.setForeground(card3.getBackground());
        taemogy.add(empty97,c);
        c.gridx = 2;
        c.gridy = 1;
        empty98.setForeground(card3.getBackground());
        taemogy.add(empty98,c);
        c.gridx = 3;
        c.gridy = 1;

        taemogy.add(button24,c);
        
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        
        taemogy.add(tmesen2,c);
        c.gridx = 1;
        c.gridy = 2;
        
        taemogy.add(tmeshun2,c);
        c.gridx = 2;
        c.gridy = 2;
        
        taemogy.add(tmeslatin2,c);
        c.gridx = 3;
        c.gridy = 2;
        
        taemogy.add(button27,c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        empty99.setForeground(card3.getBackground());
        taemogy.add(empty99,c);
        c.gridx = 1;
        c.gridy = 3;
        empty100.setForeground(card3.getBackground());
        taemogy.add(empty100,c);
        c.gridx = 2;
        c.gridy = 3;
        empty101.setForeground(card3.getBackground());
        taemogy.add(empty101,c);
        c.gridx = 3;
        c.gridy = 3;
        empty102.setForeground(card3.getBackground());
        taemogy.add(empty102,c);
        
        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        empty103.setForeground(card3.getBackground());
        taemogy.add(empty103,c);
        c.gridx = 1;
        c.gridy = 4;
        
        empty104.setForeground(card3.getBackground());
        taemogy.add(empty104,c);
        c.gridx = 2;
        c.gridy = 4;
        empty105.setForeground(card3.getBackground());
        taemogy.add(empty105,c);
        c.gridx = 3;
        c.gridy = 4;
        empty106.setForeground(card3.getBackground());
        taemogy.add(empty106,c); 
        
        

        // card4
        
        card4.setLayout(layout1);        
        card4.setBorder(BorderFactory.createCompoundBorder(outer, inner));  
               
        matirollo.setLayout(layout2);
        matirollo.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        c.ipadx=10;
        c.weightx = 1;
        c.insets = new Insets(10,10,10,10);
        matirollo.add(matterf,c);
        
        c.gridx = 1;
        c.gridy = 0;
        matirollo.add(terfezoideshun,c);
        c.gridx = 2;
        c.gridy = 0;
        matirollo.add(terfezoideslatin,c);
        c.gridx = 3;
        c.gridy = 0;
        
        
        matirollo.add(button28,c);
        button28.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 1;
        
        c.ipadx=10;
        c.weightx = 1;
        empty107.setForeground(card4.getBackground());
        matirollo.add(empty107,c);
        c.gridx = 1;
        c.gridy = 1;
        empty108.setForeground(card4.getBackground());
        matirollo.add(empty108,c);
        c.gridx = 2;
        c.gridy = 1;
        empty109.setForeground(card4.getBackground());
        matirollo.add(empty109,c);
        c.gridx = 3;
        c.gridy = 1;
        empty110.setForeground(card4.getBackground());
        matirollo.add(empty110,c);
        
        c.gridx = 0;
        c.gridy = 2;
        
        
        c.weightx = 1;
        empty111.setForeground(card4.getBackground());
        matirollo.add(empty111,c);
        c.gridx = 1;
        c.gridy = 2;
        empty112.setForeground(card4.getBackground());
        matirollo.add(empty112,c);
        c.gridx = 2;
        c.gridy = 2;
        empty113.setForeground(card4.getBackground());
        matirollo.add(empty113,c);
        c.gridx = 3;
        c.gridy = 2;
        empty114.setForeground(card4.getBackground());
        matirollo.add(empty114,c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        
        c.weightx = 1;
        empty115.setForeground(card4.getBackground());
        matirollo.add(empty115,c);
        c.gridx = 1;
        c.gridy = 3;
        empty116.setForeground(card4.getBackground());
        matirollo.add(empty116,c);
        c.gridx = 2;
        c.gridy = 3;
        empty117.setForeground(card4.getBackground());
        matirollo.add(empty117,c);
        c.gridx = 3;
        c.gridy = 3;
        empty118.setForeground(card4.getBackground());
        matirollo.add(empty118,c);
        
        c.gridx = 0;
        c.gridy = 4;
        
        
        c.weightx = 1;
        empty119.setForeground(card4.getBackground());
        matirollo.add(empty119,c);
        c.gridx = 1;
        c.gridy = 4;
        
        empty120.setForeground(card4.getBackground());
        matirollo.add(empty120,c);
        c.gridx = 2;
        c.gridy = 4;
        empty121.setForeground(card4.getBackground());
        matirollo.add(empty121,c);
        c.gridx = 3;
        c.gridy = 4;
        empty122.setForeground(card4.getBackground());
        matirollo.add(empty122,c); 
                     
        
        card4.add(matirollo);
             
        
        
        tabbedPane.addTab("Fenyő (Pinus)", card1);
        tabbedPane.addTab("Tölgy (Quercus)", card2);
        tabbedPane.addTab("Mogyoró (Coryllus)", card3);
        tabbedPane.addTab("Akác (Robinia)", card4);
        
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        pane.add(tabbedPane, BorderLayout.CENTER);
        //pane.setBackground(Color.WHITE);
    }
   
    protected static Image getFDImage() {
        java.net.URL imgURL = TabDemo.class.getResource("tuber.gif");
        if (imgURL != null) {
            return new ImageIcon(imgURL).getImage();
        } else {
            return null;
        }
    }
    
    static ImageIcon createImageIcon(String path) 
{
    java.net.URL imgURL = TabDemo.class.getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL);
    } else {
        
        return null;
    }
}
    
    
    public static void createAndShowGUI() {
        
        //JFrame.setDefaultLookAndFeelDecorated(true);
        //JDialog.setDefaultLookAndFeelDecorated(true);


        //Create and set up the window.
        JFrame frame = new JFrame("Micoqual-Határozókulcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        //frame.setDefaultLookAndFeelDecorated(true);
        
        //Create and set up the content pane.
        TabDemo demo = new TabDemo(frame);
        demo.addComponentToPane(frame.getContentPane());
        frame.setJMenuBar(demo.createMenuBar());
        
        frame.setIconImage(getFDImage());
        
        
        //Display the window.
        frame.setSize(800,380);
        frame.setVisible(true);
        
        //ha középre akarom állítani az ablakot!
        //frame.setLocationRelativeTo(null);      

    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Turn off metal's use of bold fonts
	UIManager.put("swing.boldMetal", Boolean.FALSE);
    
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
// TODO code application logic here
    }
    
});   // TODO code application logic here
        


    // TODO code application logic here
    }

    public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand() == "Névjegy")
    {
    
    
    if (Desktop.isDesktopSupported()) {
        desktop = Desktop.getDesktop();
        if (desktop.isSupported(Desktop.Action.MAIL)){ 
        NevJegy nj = new NevJegy();
        JOptionPane.showMessageDialog(frame,nj,"Micoqual - Határozókulcs",JOptionPane.INFORMATION_MESSAGE); 
               
        }
        
    }
    else {
    JOptionPane.showMessageDialog(frame," A Jedlik Árnyos program keretében\n " + "  készítette: Dr. Szlávik Szabolcs\n" + "         szlaviksz@ommi.hu\n"+ "Mezőgazdasági Szakigazgatási Hivatal\n " + "                   Központ\n" + "                   Budapest\n"+ "                      2007." ,"Micoqual - Határozókulcs",JOptionPane.INFORMATION_MESSAGE);
    }
    }
    if (e.getActionCommand() == "Kilépés")
    {
    Toolkit.getDefaultToolkit().beep();
    Object reply[] = {"Igen", "Nem"};
    int valasz = JOptionPane.showOptionDialog(frame,"Valóban ki akarsz lépni?","Kilépés",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,reply,null);    
    if (valasz == JOptionPane.YES_OPTION){
    System.exit(0);}
    
    
    }
    
    if (e.getActionCommand() == "Irodalom")
    {
    if (Desktop.isDesktopSupported()) {
        desktop = Desktop.getDesktop();
        if (desktop.isSupported(Desktop.Action.BROWSE)){ 
        Irodalom ir = new Irodalom();
        JOptionPane.showMessageDialog(frame,ir,"Irodalom",JOptionPane.INFORMATION_MESSAGE); 
               
        }
        
    }
    else {
    JOptionPane.showMessageDialog(frame,"1. Agerer R.(1987): Colour Atlas of Ectomycorrhizae\n" + "2. DEEMY - Determination of Ectomycorrhizae (http://www.deemy.de)\n"
                    
           ,"Irodalom",JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    if (e.getActionCommand() == "Tipp")
    {
    
    JOptionPane.showMessageDialog(frame,"#1\n" + "A program használatához legalább 800x600-as képernyőfelbontás javasolt.  \n"
                    
           ,"Tipp",JOptionPane.INFORMATION_MESSAGE);
    }
    
    if (e.getSource() == button1){
    EgyszeruDialog dialog = new EgyszeruDialog(fp, title1);    
  
    }
    
    if (e.getSource() == button2){
    EgyszeruDialog dialog = new EgyszeruDialog(fp2, title2);
    
    
    }
    
    if (e.getSource() == button3){
    EgyszeruDialog dialog = new EgyszeruDialog(fp3, title3);
    
    }
    
    if (e.getSource() == button4){
    
    card1.removeAll();
    
    card1.repaint();
    card1.setLayout(layout1);
    
    card1.add(boletus);       
    
    }
    
    if (e.getSource() == button5){
    card1.removeAll();
    card1.repaint();
    card1.setLayout(layout1);
                  
    card1.add(taestivum);   
    
    }
    
    if (e.getSource() == button6){
    EgyszeruDialog dialog = new EgyszeruDialog(fp4, title4);
        
    }
    
    if (e.getSource() == button7){
    EgyszeruDialog dialog = new EgyszeruDialog(fp5, title5);
    
    }
    
    if (e.getSource() == button8){
    EgyszeruDialog dialog = new EgyszeruDialog(fp6, title6);
        
    }
    
    if (e.getSource() == button9){
    card1.removeAll();
    card1.repaint();
    card1.setLayout(layout1);        
        card1.setBorder(BorderFactory.createCompoundBorder(outer, inner));  
        
        card1.add(lactarius);
        
    }
    
    if (e.getSource() == button10){
    card1.removeAll();
    card1.repaint();
    card1.setLayout(layout1);        
        card1.setBorder(BorderFactory.createCompoundBorder(outer, inner));  
               
        card1.add(lactarius);
        
    }
    
    
    if (e.getSource() == button11){
    EgyszeruDialog dialog = new EgyszeruDialog(fp3, title3);
    
    }
    
    if (e.getSource() == button12){
    EgyszeruDialog dialog = new EgyszeruDialog(fp4, title4);
    
    }
    
    if (e.getSource() == button13){
    card2.removeAll();
    card2.repaint();
    card2.setLayout(layout1);
    card2.setBorder(BorderFactory.createCompoundBorder(outer, inner));
    
    
        //button1.addActionListener(this);
        card2.add(elag1);
  
    }
     if (e.getSource() == button14){
    card2.removeAll();
    card2.repaint();
    card2.setLayout(layout1);
    card2.setBorder(BorderFactory.createCompoundBorder(outer, inner));
    
        card2.add(taetolgy);
    
     }
    
     if (e.getSource() == button15){
    card2.removeAll();
    card2.repaint();
    card2.setLayout(layout1);
    card2.setBorder(BorderFactory.createCompoundBorder(outer, inner));
    
    card2.add(elagazo);
      
     }
    
    if (e.getSource() == button16){
    EgyszeruDialog dialog = new EgyszeruDialog(fp7, title7);
    
    }
    
    if (e.getSource() == button17){
    EgyszeruDialog dialog = new EgyszeruDialog(fp8, title8);
    
    
    }
    
    if (e.getSource() == button18){
    EgyszeruDialog dialog = new EgyszeruDialog(fp9, title9);
    
    
    }
    
     if (e.getSource() == button19){
    EgyszeruDialog dialog = new EgyszeruDialog(fp10, title10);
    
    
    }
    
    if (e.getSource() == button20){
    card2.removeAll();
    card2.repaint();
    card2.setLayout(layout1);
    card2.setBorder(BorderFactory.createCompoundBorder(outer, inner));
    
    card2.add(cantharellus2);
    
    }
    
    if (e.getSource() == button20b){
    card2.removeAll();
    card2.repaint();
    card2.setLayout(layout1);
    card2.setBorder(BorderFactory.createCompoundBorder(outer, inner));
    
    card2.add(cantharellus2);
    
    }
    
    if (e.getSource() == button21){
        EgyszeruDialog dialog = new EgyszeruDialog(fp11, title11);
        
        
    }
        
    
    if (e.getSource() == button22){
        EgyszeruDialog dialog = new EgyszeruDialog(fp12, title12);
        
    
    }
     if (e.getSource() == button23){
    EgyszeruDialog dialog = new EgyszeruDialog(fp9, title9);
    
    
    }
    
     if (e.getSource() == button24){
    EgyszeruDialog dialog = new EgyszeruDialog(fp10, title10);
   
    }
    if (e.getSource() == button25){
    card3.removeAll();
    card3.repaint();
    card3.setLayout(layout1);
    card3.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        card3.add(taemogy);
        
    }
    
     if (e.getSource() == button27){
    card3.removeAll();
    card3.repaint();
    card3.setLayout(layout1);
    card3.setBorder(BorderFactory.createCompoundBorder(outer, inner));
    
        card3.add(angular);
    
    }
     if (e.getSource() == button28){
    EgyszeruDialog dialog = new EgyszeruDialog(fp14, title14);

    }

    if (e.getSource() == button29){
    EgyszeruDialog dialog = new EgyszeruDialog(fp13, title13);

    }

    if (e.getSource() == button30){
    EgyszeruDialog dialog = new EgyszeruDialog(fp15, title15);

    }

    }
    
   
}

class EgyszeruDialog extends JDialog {
Rectangle bounds = (TabDemo.frame.getBounds());
  
EgyszeruDialog(PicPanel number, String title) {
 //setDefaultLookAndFeelDecorated(true);
 setTitle(title);
 setModal(true); 
 setAlwaysOnTop(true);
 add(number);
 //setIconImage(TabDemo.getFDImage());
 setResizable(false);
 //setLocation(125,10);
 if (bounds.height > 430) {
 setLocation(bounds.x + (bounds.width - 550)/2, bounds.y + (bounds.height - 430)/2); 
 }
 else {
 setLocation(bounds.x + (bounds.width - 550)/2, 10);   
 }
 setDefaultCloseOperation(DISPOSE_ON_CLOSE);
 
 pack();
 
 setVisible(true);
}    

    
}
 
  
  class PicPanel extends JPanel {
    
    public PicPanel(JScrollPane scrollpane){
    //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    //scrollpane.createVerticalScrollBar();
    scrollpane.setPreferredSize(new Dimension (550,430));
    
    add(scrollpane);

}

    
    
}   


class NevJegy extends JPanel implements MouseListener {
    
    JLabel mail = new JLabel("szlavikszabolcs@szlavikszabolcs.hu",JLabel.LEFT);
    Desktop desktop = null;
    URI uriMailTo = null;
    Cursor hand = new Cursor(12);
    JLabel jedlik = new JLabel("Készítette: Dr. Szlávik Szabolcs",JLabel.LEFT);
    JLabel keszit = new JLabel("Budaörs",JLabel.LEFT);
    JLabel mgszh = new JLabel("2007-2009.",JLabel.LEFT);
    JLabel kozpont = new JLabel("Ellenőrizve:",JLabel.LEFT);
    JLabel bp = new JLabel("Szeged",JLabel.LEFT);
    JLabel year = new JLabel("2020.",JLabel.LEFT);
    
    GridLayout layout = new GridLayout(7,1,5,5);
    
NevJegy() {
 
        //setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));       
        setLayout(layout);
        mail.setForeground(Color.BLUE);
        
        add(jedlik);
                
        add(mail);
        
        add(keszit);
       
        add(mgszh);
        
        add(kozpont);
        
        add(bp);
        
        add(year);

        mail.addMouseListener(this);
        
} 

    public void mouseClicked(MouseEvent e) {
    if (e.getSource() == mail){
    desktop = Desktop.getDesktop(); 
 
        try {
            
                uriMailTo = new URI("mailto", "szabolcsszlavik@gmail.com", null);
                desktop.mail(uriMailTo);
           
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        catch(URISyntaxException use) {
          use.printStackTrace();
        }
        
    }
    
    
    }

    public void mousePressed(MouseEvent e) {
    
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    mail.setCursor(hand);
    }

    public void mouseExited(MouseEvent e) {
    }

    
}

class Irodalom extends JPanel implements MouseListener {
    
    
    Desktop desktop = null;
    URI uri = null;
    Cursor hand = new Cursor(12);
    JLabel agerer = new JLabel("1. Agerer R.(1987): Colour Atlas of Ectomycorrhizae");
    JLabel deemy = new JLabel("<html>2. DEEMY - Determination of Ectomycorrhizae <font color=blue><u>(http://www.deemy.de)</html>");
    
    
    GridLayout layout = new GridLayout(2,1,5,5);
    
Irodalom() {
 
        //setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));       
        setLayout(layout);
        
        
        add(agerer);
                
        add(deemy);
        
        

        deemy.addMouseListener(this);
        
} 

    public void mouseClicked(MouseEvent e) {
    if (e.getSource() == deemy){
    desktop = Desktop.getDesktop(); 
 
        try {
            
                uri = new URI("http://www.deemy.de");
                desktop.browse(uri);
           
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        catch(URISyntaxException use) {
          use.printStackTrace();
        }
        
    }
    
    
    }

    public void mousePressed(MouseEvent e) {
    
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    deemy.setCursor(hand);
    }

    public void mouseExited(MouseEvent e) {
    }

    
}