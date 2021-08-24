/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.boilerjcsp;

import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.IJAssignmentTarget;
import com.helger.jcodemodel.JBlock;
import com.helger.jcodemodel.JClassAlreadyExistsException;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldRef;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JSwitch;
import com.helger.jcodemodel.JVar;
import com.helger.jcodemodel.writer.SingleStreamCodeWriter;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.jcsp.lang.AltingChannelInput;
import org.jcsp.lang.AltingChannelInputInt;
import org.jcsp.lang.Any2AnyChannel;
import org.jcsp.lang.Any2AnyChannelInt;
import org.jcsp.lang.Any2OneChannel;
import org.jcsp.lang.Any2OneChannelInt;
import org.jcsp.lang.CSProcess;
import org.jcsp.lang.Channel;
import org.jcsp.lang.ChannelOutput;
import org.jcsp.lang.ChannelOutputInt;
import org.jcsp.lang.One2AnyChannel;
import org.jcsp.lang.One2AnyChannelInt;
import org.jcsp.lang.One2OneChannel;
import org.jcsp.lang.One2OneChannelInt;
import org.jcsp.lang.Parallel;
import org.jcsp.lang.SharedChannelInput;
import org.jcsp.lang.SharedChannelInputInt;
import org.jcsp.util.InfiniteBuffer;

/**
 *
 * @author erhannis
 */
public class MainFrame extends javax.swing.JFrame {

  /**
   * Creates new form MainFrame
   */
  public MainFrame() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnGenerate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taSpecification = new javax.swing.JTextArea();
        btnExampleProcessInterface = new javax.swing.JButton();
        btnExampleChannel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCode = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BoilerJCSP");

        jSplitPane1.setDividerLocation(250);

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        taSpecification.setColumns(20);
        taSpecification.setRows(5);
        taSpecification.setText("name: UITest\ntype: processinterface\nchannelOut: int channel1\nchannelOut: java.lang.String channel2\nchannelOut: int channel3");
        taSpecification.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taSpecificationKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(taSpecification);

        btnExampleProcessInterface.setText("Pi");
        btnExampleProcessInterface.setToolTipText("Example: process interface");
        btnExampleProcessInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExampleProcessInterfaceActionPerformed(evt);
            }
        });

        btnExampleChannel.setText("Ch");
        btnExampleChannel.setToolTipText("Example: channel");
        btnExampleChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExampleChannelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenerate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExampleProcessInterface)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExampleChannel)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerate)
                    .addComponent(btnExampleProcessInterface)
                    .addComponent(btnExampleChannel))
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        taCode.setColumns(20);
        taCode.setFont(new java.awt.Font("Courier", 0, 15)); // NOI18N
        taCode.setRows(5);
        jScrollPane1.setViewportView(taCode);

        jSplitPane1.setRightComponent(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
    try {
      taCode.setText(generate(taSpecification.getText()));
    } catch (IOException ex) {
      Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (JClassAlreadyExistsException ex) {
      Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnExampleProcessInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExampleProcessInterfaceActionPerformed
        taSpecification.setText("name: UITest\ntype: processinterface\nchannelOut: int channel1\nchannelOut: java.lang.String channel2\nchannelOut: int channel3");
    }//GEN-LAST:event_btnExampleProcessInterfaceActionPerformed

    private void btnExampleChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExampleChannelActionPerformed
        taSpecification.setText("name: dataControl\n" +
                                "type: channel\n" +
                                "mode: any2one\n" +
                                "class: int");
    }//GEN-LAST:event_btnExampleChannelActionPerformed

    private void taSpecificationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taSpecificationKeyPressed
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGenerateActionPerformed(null);
        }
    }//GEN-LAST:event_taSpecificationKeyPressed

  private static String generate(String spec) throws IOException, JClassAlreadyExistsException {
    /*
    Spec:
    name:<name>
    type:<type>
    channelOut:<name>
    channelOut:<name>
    ...
    */
    String name;
    String type;
    
    List<String> lines = Arrays.<String>asList(spec.split("\\r?\\n"));
    lines = lines.stream().filter((line) -> !line.isEmpty()).map((line) -> line.replaceAll("[\\s]+", " ")).collect(Collectors.toList());
    
    String line = lines.remove(0).replaceAll(" ", "");
    if (line.startsWith("name:")) {
      name = line.substring("name:".length());
    } else {
      throw new IllegalArgumentException("Line 1 must start with \"name:\"");
    }
    
    line = lines.remove(0).replaceAll(" ", "");
    if (line.startsWith("type:")) {
      type = line.substring("type:".length());
    } else {
      throw new IllegalArgumentException("Line 2 must start with \"type:\"");
    }
    List<String> validTypes = Arrays.asList(new String[]{"processinterface", "channel"});
    if (!validTypes.contains(type)) {
      throw new IllegalArgumentException("Type must be one of {" + String.join(", ", validTypes) + "}");
    }
    
    switch (type) {
        case "processinterface":
            return makeProcessInterface(spec, name, lines);
        case "channel":
            String mode;
            String clazz;
            line = lines.remove(0).replaceAll(" ", "");
            if (line.startsWith("mode:")) {
              mode = line.substring("mode:".length());
            } else {
              throw new IllegalArgumentException("Line 3 must start with \"mode:\"");
            }
            line = lines.remove(0).replaceAll(" ", "");
            if (line.startsWith("class:")) {
              clazz = line.substring("class:".length());
            } else {
              throw new IllegalArgumentException("Line 4 must start with \"class:\"");
            }
            JCodeModel codeModel = new JCodeModel();
            JPackage jp = codeModel._package("");
            JDefinedClass _blank = jp._class("Blank");
            JBlock _b = _blank.init();
            JVar l_c;
            JVar l_ci;
            JVar l_co;
            switch (mode) {
                case "o2o":
                case "one2one":
                    if ("int".equals(clazz)) {
                        Class channelClazz = One2OneChannelInt.class;
                        String channelFactoryMethod = "one2oneInt";
                        Class channelInClazz = AltingChannelInputInt.class;
                        Class channelOutClazz = ChannelOutputInt.class;
                        l_c = _b.decl(codeModel.ref(channelClazz), name + "Channel", codeModel.ref(Channel.class).staticInvoke(channelFactoryMethod));
                        l_ci = _b.decl(codeModel.ref(channelInClazz), name + "In", l_c.invoke("in"));
                        l_co = _b.decl(codeModel.ref(channelOutClazz), name + "Out", l_c.invoke("out"));
                    } else {
                        Class channelClazz = One2OneChannel.class;
                        Class channelInClazz = AltingChannelInput.class;
                        Class channelOutClazz = ChannelOutput.class;
                        String channelFactoryMethod = "one2one";
                        AbstractJClass generic = codeModel.ref(clazz);
                        l_c = _b.decl(codeModel.ref(channelClazz).narrow(generic), name + "Channel", codeModel.ref(Channel.class).staticInvoke(channelFactoryMethod).narrow(generic));
                        l_ci = _b.decl(codeModel.ref(channelInClazz).narrow(generic), name + "In", l_c.invoke("in"));
                        l_co = _b.decl(codeModel.ref(channelOutClazz).narrow(generic), name + "Out", l_c.invoke("out"));
                    }
                    break;
                case "o2a":
                case "one2any":
                    if ("int".equals(clazz)) {
                        Class channelClazz = One2AnyChannelInt.class;
                        String channelFactoryMethod = "one2anyInt";
                        Class channelInClazz = SharedChannelInputInt.class;
                        Class channelOutClazz = ChannelOutputInt.class;
                        l_c = _b.decl(codeModel.ref(channelClazz), name + "Channel", codeModel.ref(Channel.class).staticInvoke(channelFactoryMethod));
                        l_ci = _b.decl(codeModel.ref(channelInClazz), name + "In", l_c.invoke("in"));
                        l_co = _b.decl(codeModel.ref(channelOutClazz), name + "Out", l_c.invoke("out"));
                    } else {
                        Class channelClazz = One2AnyChannel.class;
                        Class channelInClazz = SharedChannelInput.class;
                        Class channelOutClazz = ChannelOutput.class;
                        String channelFactoryMethod = "one2any";
                        AbstractJClass generic = codeModel.ref(clazz);
                        l_c = _b.decl(codeModel.ref(channelClazz).narrow(generic), name + "Channel", codeModel.ref(Channel.class).staticInvoke(channelFactoryMethod).narrow(generic));
                        l_ci = _b.decl(codeModel.ref(channelInClazz).narrow(generic), name + "In", l_c.invoke("in"));
                        l_co = _b.decl(codeModel.ref(channelOutClazz).narrow(generic), name + "Out", l_c.invoke("out"));
                    }
                    break;
                case "a2o":
                case "any2one":
                    if ("int".equals(clazz)) {
                        Class channelClazz = Any2OneChannelInt.class;
                        String channelFactoryMethod = "any2oneInt";
                        Class channelInClazz = AltingChannelInputInt.class;
                        Class channelOutClazz = ChannelOutputInt.class;
                        l_c = _b.decl(codeModel.ref(channelClazz), name + "Channel", codeModel.ref(Channel.class).staticInvoke(channelFactoryMethod));
                        l_ci = _b.decl(codeModel.ref(channelInClazz), name + "In", l_c.invoke("in"));
                        l_co = _b.decl(codeModel.ref(channelOutClazz), name + "Out", l_c.invoke("out"));
                    } else {
                        Class channelClazz = Any2OneChannel.class;
                        Class channelInClazz = AltingChannelInput.class;
                        Class channelOutClazz = ChannelOutput.class;
                        String channelFactoryMethod = "any2one";
                        AbstractJClass generic = codeModel.ref(clazz);
                        l_c = _b.decl(codeModel.ref(channelClazz).narrow(generic), name + "Channel", codeModel.ref(Channel.class).staticInvoke(channelFactoryMethod).narrow(generic));
                        l_ci = _b.decl(codeModel.ref(channelInClazz).narrow(generic), name + "In", l_c.invoke("in"));
                        l_co = _b.decl(codeModel.ref(channelOutClazz).narrow(generic), name + "Out", l_c.invoke("out"));
                    }
                    break;
                case "a2a":
                case "any2any":
                    if ("int".equals(clazz)) {
                        Class channelClazz = Any2AnyChannelInt.class;
                        String channelFactoryMethod = "any2anyInt";
                        Class channelInClazz = SharedChannelInputInt.class;
                        Class channelOutClazz = ChannelOutputInt.class;
                        l_c = _b.decl(codeModel.ref(channelClazz), name + "Channel", codeModel.ref(Channel.class).staticInvoke(channelFactoryMethod));
                        l_ci = _b.decl(codeModel.ref(channelInClazz), name + "In", l_c.invoke("in"));
                        l_co = _b.decl(codeModel.ref(channelOutClazz), name + "Out", l_c.invoke("out"));
                    } else {
                        Class channelClazz = Any2AnyChannel.class;
                        Class channelInClazz = SharedChannelInput.class;
                        Class channelOutClazz = ChannelOutput.class;
                        String channelFactoryMethod = "any2any";
                        AbstractJClass generic = codeModel.ref(clazz);
                        l_c = _b.decl(codeModel.ref(channelClazz).narrow(generic), name + "Channel", codeModel.ref(Channel.class).staticInvoke(channelFactoryMethod).narrow(generic));
                        l_ci = _b.decl(codeModel.ref(channelInClazz).narrow(generic), name + "In", l_c.invoke("in"));
                        l_co = _b.decl(codeModel.ref(channelOutClazz).narrow(generic), name + "Out", l_c.invoke("out"));
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Mode must be one of: {o2o, o2a, a2o, a2a, one2one, one2any, any2one, any2any}");
            }
            _blank.field(JMod.PRIVATE | JMod.FINAL, l_c.type(), l_c.name());
            _blank.field(JMod.PRIVATE | JMod.FINAL, l_ci.type(), l_ci.name());
            _blank.field(JMod.PRIVATE | JMod.FINAL, l_co.type(), l_co.name());

            // Generate the code
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            codeModel.build(new SingleStreamCodeWriter(baos));
            return new String(baos.toByteArray());
        default:
            throw new RuntimeException("Unhandled type: " + type);
    }
  }
  
  private static String makeProcessInterface(String spec, String name, List<String> lines) throws JClassAlreadyExistsException, IOException {
    ArrayList<ChannelDescription> channels = new ArrayList<>();
    for (String l : lines) {
      if (l.startsWith("channelOut:")) {
        l = l.substring("channelOut:".length(), l.length());
        while (l.startsWith(" ")) {
          l = l.substring(1);
        }
        if (l.startsWith("int ")) {
          String cName = l.substring("int ".length());
          channels.add(new ChannelDescription(ChannelDescription.ChannelType.CHANNEL_OUT, cName, true, null, null));
        } else {
          int space = l.indexOf(" ");
          if (space < 0) {
            throw new IllegalArgumentException("Channel specs must have a type, a space, then the channel name.");
          }
          String cType = l.substring(0, space);
          String cName = l.substring(space + 1);
          channels.add(new ChannelDescription(ChannelDescription.ChannelType.CHANNEL_OUT, cName, false, cType, null));
        }
      } else if (l.startsWith("channelIn:")) {
        l = l.substring("channelIn:".length(), l.length());
        throw new IllegalArgumentException("ChannelIn not yet implemented");
      } else if (l.startsWith("channelCall:")) {
        l = l.substring("channelCall:".length(), l.length());
        throw new IllegalArgumentException("ChannelCall not yet implemented");
      } else {
        throw new IllegalArgumentException("Line 3+ must start with one of {channelOut, channelIn, channelCall}");
      }
    }

    // Modified from https://sookocheff.com/post/java/generating-java-with-jcodemodel/
    JCodeModel codeModel = new JCodeModel();
    JPackage jp = codeModel._package("");
    JDefinedClass p = jp._class(name + "Process");
    p._implements(CSProcess.class);
    p.javadoc().add(""
            + "AUTOGENERATED, DO NOT TOUCH (except the run method)\n"
            + "Specification:\n"
            + spec);
    JDefinedClass pi = p._class(JMod.PUBLIC | JMod.STATIC, name + "ProcessInterface");
    pi._extends(Parallel.class);
    JDefinedClass mi = pi._class(JMod.PRIVATE | JMod.STATIC, "MethodInvocation");
    { // Process Interface
      JFieldVar mi_option = mi.field(JMod.PUBLIC | JMod.FINAL, int.class, "option");
      JFieldVar mi_valueInt = mi.field(JMod.PUBLIC | JMod.FINAL, int.class, "valueInt");
      JFieldVar mi_value = mi.field(JMod.PUBLIC | JMod.FINAL, Object.class, "value");
      {
        JMethod mi_c = mi.constructor(JMod.PUBLIC);
        JVar c_option = mi_c.param(int.class, "option");
        JVar c_valueInt = mi_c.param(int.class, "valueInt");
        JVar c_value = mi_c.param(Object.class, "value");
        mi_c.body()
                .assign(JExpr._this().ref(mi_option), c_option)
                .assign(JExpr._this().ref(mi_valueInt), c_valueInt)
                .assign(JExpr._this().ref(mi_value), c_value);
      }
      ArrayList<JFieldVar> channelConsts = new ArrayList<>();
      for (int i = 0; i < channels.size(); i++) {
        ChannelDescription channel = channels.get(i);
        JFieldVar cConst = pi.field(JMod.PRIVATE | JMod.STATIC | JMod.FINAL, int.class, "METHOD_" + channel.name, JExpr.lit(i));
        channelConsts.add(cConst);
      }
      AbstractJClass rawMicoClazz = codeModel.ref(ChannelOutput.class);
      AbstractJClass micoClazz = rawMicoClazz.narrow(mi);
      JFieldVar mico = pi.field(JMod.PRIVATE | JMod.FINAL, micoClazz, "methodInvocationChannelOut");
      { // 
        JMethod pi_c = pi.constructor(JMod.PUBLIC);
        JVar c_mici = pi_c.param(codeModel.ref(AltingChannelInput.class).narrow(mi), "methodInvocationChannelIn");
        JVar c_mico = pi_c.param(codeModel.ref(ChannelOutput.class).narrow(mi), "methodInvocationChannelOut");
        JVar c_process = pi_c.param(p, "process");
        ArrayList<JVar> c_channels = new ArrayList<>();
        for (int i = 0; i < channels.size(); i++) {
          ChannelDescription channel = channels.get(i);
          JVar c_chan;
          switch (channel.type) {
            case CHANNEL_OUT:
              if (channel.isInt) {
                c_chan = pi_c.param(codeModel.ref(ChannelOutputInt.class), channel.name + "Out");
              } else {
                c_chan = pi_c.param(codeModel.ref(ChannelOutput.class).narrow(codeModel.ref(channel.argType)), channel.name + "Out");
              }
              break;
            case CHANNEL_IN:
            case CHANNEL_CALL:
            default:
              throw new IllegalArgumentException("Unhandled channel type: " + channel.type);
          }
          c_channels.add(c_chan);
        }
        JInvocation processArray = JExpr._new(codeModel.ref(CSProcess.class).array());
        JLambda invocationProcess = new JLambda();
        {
          JBlock loopBody = invocationProcess.body()._while(JExpr.TRUE).body();
          JVar l_mi = loopBody.decl(mi, "mi", c_mici.invoke("read"));
          JSwitch s = loopBody._switch(l_mi.ref(mi_option));
          for (int i = 0; i < channelConsts.size(); i++) {
            ChannelDescription cDesc = channels.get(i);
            JFieldVar cConst = channelConsts.get(i);
            JVar cVar = c_channels.get(i);
            switch (cDesc.type) {
              case CHANNEL_OUT:
                if (cDesc.isInt) {
                  s._case(cConst).body().add(cVar.invoke("write").arg(l_mi.ref(mi_valueInt)))._break();
                } else {
                  s._case(cConst).body().add(cVar.invoke("write").arg(JExpr.cast(codeModel.ref(cDesc.argType), l_mi.ref(mi_value))))._break();
                }
                break;
              case CHANNEL_IN:
              case CHANNEL_CALL:
              default:
                throw new IllegalArgumentException("Unhandled channel type: " + cDesc.type);
            }
          }
          s._default().body()._throw(JExpr._new(codeModel.ref(IllegalArgumentException.class)).arg(JExpr.lit("Something went wrong; no method # ").plus(l_mi.ref(mi_option)).plus(" known")));
        }

        processArray.arg(invocationProcess);
        processArray.arg(c_process);
        pi_c.body().invoke("super").arg(processArray);
        pi_c.body().assign(JExpr._this().ref(mico), c_mico);
      }
      for (int i = 0; i < channelConsts.size(); i++) {
        ChannelDescription cDesc = channels.get(i);
        JFieldVar cConst = channelConsts.get(i);
        switch (cDesc.type) {
          case CHANNEL_OUT:
            if (cDesc.isInt) {
              JMethod pi_m = pi.method(JMod.PUBLIC, Void.TYPE, cDesc.name + "Out");
              JVar pi_m_val = pi_m.param(int.class, "value");
              pi_m.body().add(mico.invoke("write").arg(JExpr._new(mi).arg(cConst).arg(pi_m_val).arg(JExpr._null())));//TODO wrong
            } else {
              JMethod pi_m = pi.method(JMod.PUBLIC, Void.TYPE, cDesc.name + "Out");
              JVar pi_m_val = pi_m.param(codeModel.ref(cDesc.argType), "value");
              pi_m.body().add(mico.invoke("write").arg(JExpr._new(mi).arg(cConst).arg(JExpr.lit(0)).arg(pi_m_val)));//TODO wrong
            }
            break;
          case CHANNEL_IN:
          case CHANNEL_CALL:
          default:
            throw new IllegalArgumentException("Unhandled channel type: " + cDesc.type);
        }
      }
    }
    ArrayList<JFieldVar> channelFields = new ArrayList<>();
    for (int i = 0; i < channels.size(); i++) {
      ChannelDescription channel = channels.get(i);
      JFieldVar c_chan;
      switch (channel.type) {
        case CHANNEL_OUT:
          if (channel.isInt) {
            c_chan = p.field(JMod.PROTECTED | JMod.FINAL, codeModel.ref(AltingChannelInputInt.class), channel.name + "In");
          } else {
            c_chan = p.field(JMod.PROTECTED | JMod.FINAL, codeModel.ref(AltingChannelInput.class).narrow(codeModel.ref(channel.argType)), channel.name + "In");
          }
          break;
        case CHANNEL_IN:
        case CHANNEL_CALL:
        default:
          throw new IllegalArgumentException("Unhandled channel type: " + channel.type);
      }
      channelFields.add(c_chan);
    }
    {
      JMethod p_create = p.method(JMod.PUBLIC | JMod.STATIC, pi, "create");
      JBlock _b = p_create.body();
      ArrayList<JVar> l_chans = new ArrayList<JVar>();
      for (int i = 0; i < channels.size(); i++) {
        ChannelDescription channel = channels.get(i);
        JVar c_chan;
        switch (channel.type) {
          case CHANNEL_OUT:
            if (channel.isInt) {
              c_chan = _b.decl(codeModel.ref(Any2OneChannelInt.class), channel.name, codeModel.ref(Channel.class).staticInvoke("any2oneInt"));
            } else {
              c_chan = _b.decl(codeModel.ref(Any2OneChannel.class).narrow(codeModel.ref(channel.argType)), channel.name, codeModel.ref(Channel.class).staticInvoke("any2one").narrow(codeModel.ref(channel.argType)));
            }
            break;
          case CHANNEL_IN:
          case CHANNEL_CALL:
          default:
            throw new IllegalArgumentException("Unhandled channel type: " + channel.type);
        }
        l_chans.add(c_chan);
      }
      JVar l_mic = _b.decl(codeModel.ref(Any2OneChannel.class).narrow(mi), "methodInvocationChannel", codeModel.ref(Channel.class).staticInvoke("any2one").narrow(mi).arg(JExpr._new(codeModel.ref(InfiniteBuffer.class).narrow(mi))));
      JInvocation l_proc_new = JExpr._new(p);
      for (int i = 0; i < channels.size(); i++) {
        ChannelDescription channel = channels.get(i);
        JVar c_chan = l_chans.get(i);
        switch (channel.type) {
          case CHANNEL_OUT:
            l_proc_new.arg(c_chan.invoke("in"));
            break;
          case CHANNEL_IN:
          case CHANNEL_CALL:
          default:
            throw new IllegalArgumentException("Unhandled channel type: " + channel.type);
        }
      }
      JVar l_process = _b.decl(p, "process", l_proc_new);
      JInvocation l_pi_new = JExpr._new(pi).arg(l_mic.invoke("in")).arg(l_mic.invoke("out")).arg(l_process);
      for (int i = 0; i < channels.size(); i++) {
        ChannelDescription channel = channels.get(i);
        JVar c_chan = l_chans.get(i);
        switch (channel.type) {
          case CHANNEL_OUT:
            l_pi_new.arg(c_chan.invoke("out"));
            break;
          case CHANNEL_IN:
          case CHANNEL_CALL:
          default:
            throw new IllegalArgumentException("Unhandled channel type: " + channel.type);
        }
      }
      _b._return(l_pi_new);
    }
    {
      JMethod p_c = p.constructor(JMod.PUBLIC);
      ArrayList<JVar> c_channels = new ArrayList<>();
      for (int i = 0; i < channels.size(); i++) {
        ChannelDescription channel = channels.get(i);
        JVar c_chan;
        switch (channel.type) {
          case CHANNEL_OUT:
            if (channel.isInt) {
              c_chan = p_c.param(codeModel.ref(AltingChannelInputInt.class), channel.name + "In");
            } else {
              c_chan = p_c.param(codeModel.ref(AltingChannelInput.class).narrow(codeModel.ref(channel.argType)), channel.name + "In");
            }
            break;
          case CHANNEL_IN:
          case CHANNEL_CALL:
          default:
            throw new IllegalArgumentException("Unhandled channel type: " + channel.type);
        }
        c_channels.add(c_chan);
      }
      JBlock _b = p_c.body();
      for (int i = 0; i < channels.size(); i++) {
        ChannelDescription channel = channels.get(i);
        JVar f_chan = channelFields.get(i);
        JVar c_chan = c_channels.get(i);
        switch (channel.type) {
          case CHANNEL_OUT:
            _b.assign(JExpr._this().ref(f_chan), c_chan);
            break;
          case CHANNEL_IN:
          case CHANNEL_CALL:
          default:
            throw new IllegalArgumentException("Unhandled channel type: " + channel.type);
        }
      }
    }
    p.method(JMod.PUBLIC, codeModel.VOID, "run").annotate(Override.class);
    if (1 == 1) {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      codeModel.build(new SingleStreamCodeWriter(baos));
      return new String(baos.toByteArray());
    }

    
    // Add Javadoc
    p.javadoc().add("A JCodeModel example.");

    // Add default constructor
    p.constructor(JMod.PUBLIC).javadoc().add("Creates a new " + p.name() + ".");

    // Add constant serializable id
    p.field(JMod.STATIC | JMod.FINAL, Long.class, "serialVersionUID", JExpr.lit(1L));

    // Add private variable
    JFieldVar quantity = p.field(JMod.PRIVATE, Integer.class, "quantity");

    // Add get method
    JMethod getter = p.method(JMod.PUBLIC, quantity.type(), "getQuantity");
    getter.body()._return(quantity);
    getter.javadoc().add("Returns the quantity.");
    getter.javadoc().addReturn().add(quantity.name());

    // Add set method
    JMethod setter = p.method(JMod.PUBLIC, codeModel.VOID, "setQuantity");
    setter.param(quantity.type(), quantity.name());
    setter.body().assign(JExpr._this().ref(quantity.name()), JExpr.ref(quantity.name()));
    setter.javadoc().add("Set the quantity.");
    setter.javadoc().addParam(quantity.name()).add("the new quantity");

    // Generate the code
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    codeModel.build(new SingleStreamCodeWriter(baos));
    return new String(baos.toByteArray());
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainFrame().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExampleChannel;
    private javax.swing.JButton btnExampleProcessInterface;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea taCode;
    private javax.swing.JTextArea taSpecification;
    // End of variables declaration//GEN-END:variables
}
