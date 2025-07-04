
package dz.graph.dijkstra.frames;

import dz.graph.dijkstra.Dijkstra;
import dz.graph.dijkstra.FloydWarshall;
import dz.graph.dijkstra.frames.ds_graph.Graph;
import dz.graph.dijkstra.GraphTraverser;
import dz.graph.dijkstra.frames.ds_graph.Vertex;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class MainFrame extends javax.swing.JFrame {

    Graph graph;

     void icon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().
                getResource("polyline-64.png")));
    }
    private void tabeHeader(){
       JTableHeader Theader = jTable1.getTableHeader();
        Theader.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14) );
        Theader.setOpaque(false);
        
        Theader.setForeground(new Color(0, 0, 0));
        jTable1.setRowHeight(20);
      

        
    }
    public MainFrame() {
       
        initComponents();
         tabeHeader();icon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textFieldNbrVertex = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        textFieldWeight = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graph Data Structure");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        jLabel1.setText("Graph Explorer & Solver");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 530, -1));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "To", "Weight"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 59, 373, 202));

        textFieldNbrVertex.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textFieldNbrVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNbrVertexActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldNbrVertex, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 148, 126, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Enter the Number Of Vertices");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 154, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jCheckBox1.setText("Click if your Graph is Directed");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 153, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 207, 102, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("From Vertex");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 213, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 207, 102, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("To Vertex");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 213, -1, -1));

        textFieldWeight.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(textFieldWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 263, 102, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setText("Create The Graph");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 553, -1, 36));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Weight");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 269, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton3.setText("Add Edge");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 266, 111, 28));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton4.setText("Remove Selected Row");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, 35));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 385, 323, 162));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel6.setText("Created Graph");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 356, 161, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 315, 1126, 10));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 385, 297, 161));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton5.setText("Apply DFS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 598, -1, 36));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel7.setText("Traversed Output of Graph");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 356, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 564, 83, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("Starting Vertex");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 570, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 394, 148));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel9.setText("Shortest Path Finder");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 356, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 545, 83, -1));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton6.setText("Apply Dijkstra");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 545, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText("Starting Vertex");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 551, 111, -1));

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 579, 83, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 356, 19, 251));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 356, 19, 251));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setText("Ending Vertex");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 585, 111, -1));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton7.setText("Apply BFS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 598, -1, 36));

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton8.setText("Apply F-W");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 579, 132, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dz/graph/dijkstra/frames/algo p.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1150, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Vertex startVertex=graph.getVertexByValue(jComboBox4.getSelectedItem().toString());
        Vertex endVertex=graph.getVertexByValue(jComboBox5.getSelectedItem().toString());
        // Dijkstra.dijkstraResultPrinter(Dijkstra.dijkstra(graph, startVertex));
        Dijkstra.resShortestPath="";
        Dijkstra.shortestPathBetween(graph, startVertex, endVertex);
        jTextArea3.setText(Dijkstra.resShortestPath);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.removeRow(jTable1.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "please select the row for deletion ",
                "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        Vector v = new Vector();
        v.add(jComboBox1.getSelectedItem().toString());
        v.add(jComboBox2.getSelectedItem().toString());
        v.add(textFieldWeight.getText());
        dt.addRow(v);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            graph = new Graph(true, jCheckBox1.isSelected());
            System.out.println(jTable1.getRowCount());
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String data1 = jTable1.getValueAt(i, 0) + "";
                Vertex v1 = graph.getVertexByValue(data1);
                if (v1 == null) {
                    v1 = graph.addVertex(data1);
                }

                String data2 = jTable1.getValueAt(i, 1) + "";
                Vertex v2 = graph.getVertexByValue(data2);

                if (v2 == null) {
                    v2 = graph.addVertex(data2);
                }
                int weight = Integer.parseInt(jTable1.getValueAt(i, 2) + "");
                graph.addEdge(v1, v2, weight);
            }

            jTextArea1.setText(graph.print());
        } catch (Exception e) {
            System.out.println(" e= " + e.getMessage());
            JOptionPane.showMessageDialog(null, "invalid data graph ",
                "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jComboBox1.removeAllItems();
            jComboBox2.removeAllItems();
            jComboBox3.removeAllItems();
            jComboBox4.removeAllItems();
            jComboBox5.removeAllItems();

            Integer nbrVertex = Integer.parseInt(textFieldNbrVertex.getText());
            int vertex = 65;

            for (int i = 0; i < nbrVertex; i++) {
                char tmp = (char) vertex;
                jComboBox1.addItem(tmp + "");
                jComboBox2.addItem(tmp + "");
                jComboBox3.addItem(tmp + "");
                jComboBox4.addItem(tmp + "");
                jComboBox5.addItem(tmp + "");
                vertex++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number ",
                "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    String valueVertex = jComboBox3.getSelectedItem().toString();
    Vertex vertex = graph.getVertexByValue(valueVertex);
    
    ArrayList<Vertex> visitedVertices = new ArrayList<>();
    jTextArea2.setText("------ Depth First Traversal ------\n");
    
    GraphTraverser.depthFirstTraversal(vertex, visitedVertices, jTextArea2);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    String valueVertex = jComboBox3.getSelectedItem().toString();
    Vertex vertex = graph.getVertexByValue(valueVertex);
    
    ArrayList<Vertex> visitedVertices = new ArrayList<>();
    jTextArea2.setText("------ Breadth-First Search Traversal ------\n");
    
    GraphTraverser.breadthFirstSearch(vertex, visitedVertices, jTextArea2);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                                          
    Vertex startVertex = graph.getVertexByValue(jComboBox4.getSelectedItem().toString());
    Vertex endVertex = graph.getVertexByValue(jComboBox5.getSelectedItem().toString());
    
    int[][] distances = FloydWarshall.floydWarshall(graph);
    int startIndex = graph.getVertices().indexOf(startVertex);
    int endIndex = graph.getVertices().indexOf(endVertex);
    
    int shortestDistance = distances[startIndex][endIndex];
    
    StringBuilder result = new StringBuilder();
    
    if (shortestDistance == FloydWarshall.INFINITY) {
        result.append("No path exists between ").append(startVertex.getData()).append(" and ").append(endVertex.getData()).append("\n");
    } else {
        result.append("Shortest distance between ").append(startVertex.getData()).append(" and ").append(endVertex.getData()).append(": ").append(shortestDistance).append("\n");
        
        ArrayList<Vertex> pathVertices = getPathVertices(startIndex, endIndex, distances, graph.getVertices());
        result.append("Path: ");
        for (Vertex vertex : pathVertices) {
            result.append(vertex.getData()).append(" -> ");
        }
        result.delete(result.length() - 4, result.length());
        result.append("\n");
    }
        jTextArea3.setText(result.toString());
}

private ArrayList<Vertex> getPathVertices(int startIndex, int endIndex, int[][] distances, ArrayList<Vertex> vertices) {
    ArrayList<Vertex> path = new ArrayList<>();
    path.add(vertices.get(endIndex));
    
    int viaVertex = endIndex;
    while (distances[startIndex][viaVertex] != 0) {
        for (int k = 0; k < vertices.size(); k++) {
            if (distances[startIndex][viaVertex] == distances[startIndex][k] + distances[k][viaVertex]) {
                path.add(vertices.get(k));
                viaVertex = k;
                break;
            }
        }
    }
    
    Collections.reverse(path);
    return path;

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void textFieldNbrVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNbrVertexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNbrVertexActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JFormattedTextField textFieldNbrVertex;
    private javax.swing.JFormattedTextField textFieldWeight;
    // End of variables declaration//GEN-END:variables
}
