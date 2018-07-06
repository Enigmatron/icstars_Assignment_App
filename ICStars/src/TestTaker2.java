
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.URL;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author idrieskysia
 */
public class TestTaker2 extends javax.swing.JPanel {
    ArrayList<TestGenerator.TestQuestion> questions = new ArrayList<TestGenerator.TestQuestion>();
    ArrayList<Boolean> answers = new ArrayList<Boolean>();
    int numberofquestions = 3;
    int index = 0;
//    private static JFXPanel fxContainer;
    private static int JFXPANEL_WIDTH_INT = 300;
    private static int JFXPANEL_HEIGHT_INT = 250;
//    final WebView browser = new WebView();
//    final WebEngine webEngine = browser.getEngine();
     
    /**
     * Creates new form TestTaker
     */
    TestTaker2(int qNumber) {

        initComponents();
        TestGenerator.TestQuestion t1 = TestGenerator.GenerateBooleanQuestions(0,10,55);
        questions.add(t1);
//        System.out.println(t1.QNumber + ": "+t1.QQuestion + " is " + t1.QAnswer);
        for (int i  = 0; i< qNumber-1; i++){
            t1 = TestGenerator.GenerateBooleanQuestions(t1.QNumber,10,55);
            questions.add(t1);
//            System.out.println(t1.QNumber + ": "+t1.QQuestion + " is " + t1.QAnswer);
        }
//        jFXPanel1 = new JFXPanel();
//        jFXPanel1.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
//        add(jFXPanel1, BorderLayout.CENTER);
//        final WebView browser = new WebView();
//        final WebEngine webEngine = browser.getEngine();
//        browser.getStylesheets().add("assets/QuestionGenerator/style.css");
//        webEngine.load("assets/QuestionGenerator/example/ExampleTestView.html");
//        Scene sc = new Scene(browser, Color.web("#666970"));
//        jFXPanel1.setScene(sc);
//        browser.getStylesheets().add("webviewsample/BrowserToolbar.css");
        Platform.runLater(new Runnable() {
            
            @Override
            public void run() {
                createScene();
            }
        });
        ReLabel();
        
    }
    private static final String TEST_RESOURCE_NAME = "/assets/QuestionGenerator/example/ExampleTestView.html";
    private void createScene() {
//        browser.getStylesheets().add("/assets/QuestionGenerator/style.css");
//        webEngine.loadContent("assets/QuestionGenerator/example/ExampleTestView.html");
//        Scene sc = new Scene(browser, Color.web("#666970"));
        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        URL url = TestTaker2.class.getResource(TEST_RESOURCE_NAME);
        webEngine.load(url.toExternalForm());
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        StackPane root = new StackPane();
        root.getChildren().add(browser);
        jFXPanel1.setScene(new Scene(root));
    }
    
    
    public TestTaker2() {
        this(3);
    }

    private void ReLabel(){
//        jLabel1.setText("Question " + questions.get(index).QNumber + ":");
//        jLabel3.setText(questions.get(index).QQuestion);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jFXPanel1 = new javafx.embed.swing.JFXPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Banner1.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/FalseButton.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                False(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/True Button.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                True(evt);
            }
        });

        jFXPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 270, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton2)
                        .addGap(121, 121, 121)
                        .addComponent(jButton1))
                    .addComponent(jFXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jFXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void False(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_False
//        // TODO add your handling code here:
//        answers.add(index, new Boolean(false));
//        if(index < questions.size()-1){
//        index +=1;
//        ReLabel();
//        }
//        else{
////            BooleanApp.swapToMenu();
//                BooleanApp.swapToTestResults(questions, answers);
//        }
    }//GEN-LAST:event_False

    private void True(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_True
//        // TODO add your handling code here:
//        answers.add(index, new Boolean(true));
//        if(index < questions.size()-1){
//
//            index +=1;
//            ReLabel();
//        }
//        else{
////            BooleanApp.swapToMenu();
//                BooleanApp.swapToTestResults(questions, answers);
//
//        }
    }//GEN-LAST:event_True


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javafx.embed.swing.JFXPanel jFXPanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
