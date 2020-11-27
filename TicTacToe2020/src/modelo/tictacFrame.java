package modelo;
import javax.swing.JOptionPane;
public class tictacFrame extends javax.swing.JFrame {
 int pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9;
    boolean Tiro, fin = false;

    void reiniciar() {
        pos1 = 0;
        pos2 = 0;
        pos3 = 0;
        pos4 = 0;
        pos5 = 0;
        pos6 = 0;
        pos7 = 0;
        pos8 = 0;
        pos9 = 0;
        celda1.setText("");
        celda1.setEnabled(true);
        celda2.setText("");
        celda2.setEnabled(true);
        celda3.setText("");
        celda3.setEnabled(true);
        celda4.setText("");
        celda4.setEnabled(true);
        celda5.setText("");
        celda5.setEnabled(true);
        celda6.setText("");
        celda6.setEnabled(true);
        celda7.setText("");
        celda7.setEnabled(true);
        celda8.setText("");
        celda8.setEnabled(true);
        celda9.setText("");
        celda9.setEnabled(true);
        Tiro=false;
        fin=false;
    }

    void marcarPosicion(int juego, int poss) {
        switch (juego) {
            case 1:
                switch (poss) {
                    case 1:
                        pos1 = 1;
                        celda1.setText("X");
                        celda1.setEnabled(false);
                        break;
                    case 2:
                        pos2 = 1;
                        celda2.setText("X");
                        celda2.setEnabled(false);
                        break;
                    case 3:
                        pos3 = 1;
                        celda3.setText("X");
                        celda3.setEnabled(false);
                        break;
                    case 4:
                        pos4 = 1;
                        celda4.setText("X");
                        celda4.setEnabled(false);
                        break;
                    case 5:
                        pos5 = 1;
                        celda5.setText("X");
                        celda5.setEnabled(false);
                        break;
                    case 6:
                        pos6 = 1;
                        celda6.setText("X");
                        celda6.setEnabled(false);
                        break;
                    case 7:
                        pos7 = 1;
                        celda7.setText("X");
                        celda7.setEnabled(false);
                        break;
                    case 8:
                        pos8 = 1;
                        celda8.setText("X");
                        celda8.setEnabled(false);
                        break;
                    case 9:
                        pos9 = 1;
                        celda9.setText("X");
                        celda9.setEnabled(false);
                        break;
                }
                break;

            case 2:
                switch (poss) {
                    case 1:
                        pos1 = 2;
                        celda1.setText("O");
                        celda1.setEnabled(false);
                        break;
                    case 2:
                        pos2 = 2;
                        celda2.setText("O");
                        celda2.setEnabled(false);
                        break;
                    case 3:
                        pos3 = 2;
                        celda3.setText("O");
                        celda3.setEnabled(false);
                        break;
                    case 4:
                        pos4 = 2;
                        celda4.setText("O");
                        celda4.setEnabled(false);
                        break;
                    case 5:
                        pos5 = 2;
                        celda5.setText("O");
                        celda5.setEnabled(false);
                        break;
                    case 6:
                        pos6 = 2;
                        celda6.setText("O");
                        celda6.setEnabled(false);
                        break;
                    case 7:
                        pos7 = 2;
                        celda7.setText("O");
                        celda7.setEnabled(false);
                        break;
                    case 8:
                        pos8 = 2;
                        celda8.setText("O");
                        celda8.setEnabled(false);
                        break;
                    case 9:
                        pos9 = 2;
                        celda9.setText("O");
                        celda9.setEnabled(false);
                        break;
                }
                break;
        }
    }

    boolean ganador(int jugador) {
        boolean gano = false;
        switch (jugador) {

            case 1:
                if (pos1 == 1 && pos2 == 1 && pos3 == 1) {
                    gano = true;
                }
                if (pos4 == 1 && pos5 == 1 && pos6 == 1) {
                    gano = true;
                }
                if (pos7 == 1 && pos8 == 1 && pos9 == 1) {
                    gano = true;
                }
                if (pos1 == 1 && pos4 == 1 && pos7 == 1) {
                    gano = true;
                }
                if (pos2 == 1 && pos5 == 1 && pos8 == 1) {
                    gano = true;
                }
                if (pos3 == 1 && pos6 == 1 && pos9 == 1) {
                    gano = true;
                }
                if (pos1 == 1 && pos5 == 1 && pos9 == 1) {
                    gano = true;
                }
                if (pos3 == 1 && pos5 == 1 && pos7 == 1) {
                    gano = true;
                }
                break;

            case 2:
                if (pos1 == 2 && pos2 == 2 && pos3 == 2) {
                    gano = true;
                }
                if (pos4 == 2 && pos5 == 2 && pos6 == 2) {
                    gano = true;
                }
                if (pos7 == 2 && pos8 == 2 && pos9 == 2) {
                    gano = true;
                }
                if (pos1 == 2 && pos4 == 2 && pos7 == 2) {
                    gano = true;
                }
                if (pos2 == 2 && pos5 == 2 && pos8 == 2) {
                    gano = true;
                }
                if (pos3 == 2 && pos6 == 2 && pos9 == 2) {
                    gano = true;
                }
                if (pos1 == 2 && pos5 == 2 && pos9 == 2) {
                    gano = true;
                }
                if (pos3 == 2 && pos5 == 2 && pos7 == 2) {
                    gano = true;
                }
                break;
        }
        return gano;
    }

    void verificaMaquina() {
        //primera fila horizontal
        if (pos1 == 2 && pos2 == 2 && pos3 == 0 && !Tiro) {
            marcarPosicion(1, 3);
            Tiro = true;
        }
        if (pos1 == 2 && pos2 == 0 && pos3 == 2 && !Tiro) {
            marcarPosicion(1, 2);
            Tiro = true;
        }
        if (pos1 == 0 && pos2 == 2 && pos3 == 2 && !Tiro) {
            marcarPosicion(1, 1);
            Tiro = true;
        }
        //segunda fila horizontal
        if (pos4 == 2 && pos5 == 2 && pos6 == 0 && !Tiro) {
            marcarPosicion(1, 6);
            Tiro = true;
        }
        if (pos4 == 2 && pos5 == 0 && pos6 == 2 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
        if (pos4 == 0 && pos5 == 2 && pos6 == 2 && !Tiro) {
            marcarPosicion(1, 4);
            Tiro = true;
        }
        //tercera fila horizontal
        if (pos7 == 2 && pos8 == 2 && pos9 == 0 && !Tiro) {
            marcarPosicion(1, 9);
            Tiro = true;
        }
        if (pos7 == 2 && pos8 == 0 && pos9 == 2 && !Tiro) {
            marcarPosicion(1, 8);
            Tiro = true;
        }
        if (pos7 == 0 && pos8 == 2 && pos9 == 2 && !Tiro) {
            marcarPosicion(1, 7);
            Tiro = true;
        }
        //primera vertical
        if (pos1 == 2 && pos4 == 2 && pos7 == 0 && !Tiro) {
            marcarPosicion(1, 7);
            Tiro = true;
        }
        if (pos1 == 2 && pos4 == 0 && pos7 == 2 && !Tiro) {
            marcarPosicion(1, 4);
            Tiro = true;
        }
        if (pos1 == 0 && pos4 == 2 && pos7 == 2 && !Tiro) {
            marcarPosicion(1, 1);
            Tiro = true;
        }
        //segunda vertical
        if (pos2 == 2 && pos5 == 2 && pos8 == 0 && !Tiro) {
            marcarPosicion(1, 8);
            Tiro = true;
        }
        if (pos2 == 2 && pos5 == 0 && pos8 == 2 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
        if (pos2 == 0 && pos5 == 2 && pos8 == 2 && !Tiro) {
            marcarPosicion(1, 2);
            Tiro = true;
        }
        //tercera vertical
        if (pos3 == 2 && pos6 == 2 && pos9 == 0 && !Tiro) {
            marcarPosicion(1, 9);
            Tiro = true;
        }
        if (pos3 == 2 && pos6 == 0 && pos9 == 2 && !Tiro) {
            marcarPosicion(1, 6);
            Tiro = true;
        }
        if (pos3 == 0 && pos6 == 2 && pos9 == 2 && !Tiro) {
            marcarPosicion(1, 3);
            Tiro = true;
        }
        //primera diagonal
        if (pos1 == 2 && pos5 == 2 && pos9 == 0 && !Tiro) {
            marcarPosicion(1, 9);
            Tiro = true;
        }
        if (pos1 == 2 && pos5 == 0 && pos9 == 2 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
        if (pos1 == 0 && pos5 == 2 && pos9 == 2 && !Tiro) {
            marcarPosicion(1, 1);
            Tiro = true;
        }
        //segunda diagonal
        if (pos3 == 2 && pos5 == 2 && pos7 == 0 && !Tiro) {
            marcarPosicion(1, 7);
            Tiro = true;
        }
        if (pos3 == 2 && pos5 == 0 && pos7 == 2 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
        if (pos3 == 0 && pos5 == 2 && pos7 == 2 && !Tiro) {
            marcarPosicion(1, 3);
            Tiro = true;
        }//System.out.println("maquina");
    }
    
    void verificaUsuario() {
        if (pos1 == 1 && pos2 == 1 && pos3 == 0 && !Tiro) {
            marcarPosicion(1, 3);
            Tiro = true;
        }
        if (pos1 == 1 && pos2 == 0 && pos3 == 1 && !Tiro) {
            marcarPosicion(1, 2);
            Tiro = true;
        }
        if (pos1 == 0 && pos2 == 1 && pos3 == 1 && !Tiro) {
            marcarPosicion(1, 1);
            Tiro = true;
        }

        //segunda fila horizontal
        if (pos4 == 1 && pos5 == 1 && pos6 == 0 && !Tiro) {
            marcarPosicion(1, 6);
            Tiro = true;
        }
        if (pos4 == 1 && pos5 == 0 && pos6 == 1 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
        if (pos4 == 0 && pos5 == 1 && pos6 == 1 && !Tiro) {
            marcarPosicion(1, 4);
            Tiro = true;
        }
        //tercera fila horizontal
        if (pos7 == 1 && pos8 == 1 && pos9 == 0 && !Tiro) {
            marcarPosicion(1, 9);
            Tiro = true;
        }
        if (pos7 == 1 && pos8 == 0 && pos9 == 1 && !Tiro) {
            marcarPosicion(1, 8);
            Tiro = true;
        }
        if (pos7 == 0 && pos8 == 1 && pos9 == 1 && !Tiro) {
            marcarPosicion(1, 7);
            Tiro = true;
        }
        //primera vertical
        if (pos1 == 1 && pos4 == 1 && pos7 == 0 && !Tiro) {
            marcarPosicion(1, 7);
            Tiro = true;
        }
        if (pos1 == 1 && pos4 == 0 && pos7 == 1 && !Tiro) {
            marcarPosicion(1, 4);
            Tiro = true;
        }
        if (pos1 == 0 && pos4 == 1 && pos7 == 1 && !Tiro) {
            marcarPosicion(1, 1);
            Tiro = true;
        }
        //segunda vertical
        if (pos2 == 1 && pos5 == 1 && pos8 == 0 && !Tiro) {
            marcarPosicion(1, 8);
            Tiro = true;
        }
        if (pos2 == 1 && pos5 == 0 && pos8 == 1 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
        if (pos2 == 0 && pos5 == 1 && pos8 == 1 && !Tiro) {
            marcarPosicion(1, 2);
            Tiro = true;
        }
        //tercera vertical
        if (pos3 == 1 && pos6 == 1 && pos9 == 0 && !Tiro) {
            marcarPosicion(1, 9);
            Tiro = true;
        }
        if (pos3 == 1 && pos6 == 0 && pos9 == 1 && !Tiro) {
            marcarPosicion(1, 6);
            Tiro = true;
        }
        if (pos3 == 0 && pos6 == 1 && pos9 == 1 && !Tiro) {
            marcarPosicion(1, 3);

            Tiro = true;
        }
        //primera diagonal
        if (pos1 == 1 && pos5 == 1 && pos9 == 0 && !Tiro) {
            marcarPosicion(1, 9);
            Tiro = true;
        }
        if (pos1 == 1 && pos5 == 0 && pos9 == 1 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
        if (pos1 == 0 && pos5 == 1 && pos9 == 1 && !Tiro) {
            marcarPosicion(1, 1);
            Tiro = true;
        }
       //segunda diagonal
        if (pos3 == 1 && pos5 == 1 && pos7 == 0 && !Tiro) {
            marcarPosicion(1, 7);
            Tiro = true;
        }
        if (pos3 == 1 && pos5 == 0 && pos7 == 1 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
        if (pos3 == 0 && pos5 == 1 && pos7 == 1 && !Tiro) {
            marcarPosicion(1, 3);
            Tiro = true;
        }//System.out.println("usuario");
    }

    void centro() {
        if (pos5 == 0 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
    }

    void recorrer() {
        if (pos1 == 0 && !Tiro) {
            marcarPosicion(1, 1);
            Tiro = true;
        }
        if (pos2 == 0 && !Tiro) {
            marcarPosicion(1, 2);
            Tiro = true;
            System.out.println("2");
        }
        if (pos3 == 0 && !Tiro) {
            marcarPosicion(1, 3);
            Tiro = true;
            System.out.println("3");
        }
        if (pos4 == 0 && !Tiro) {
            marcarPosicion(1, 4);
            Tiro = true;
        }
        if (pos5 == 0 && !Tiro) {
            marcarPosicion(1, 5);
            Tiro = true;
        }
        if (pos6 == 0 && !Tiro) {
            marcarPosicion(1, 6);
            Tiro = true;
        }
        if (pos7 == 0 && !Tiro) {
            marcarPosicion(1, 7);
            Tiro = true;
        }
        if (pos8 == 0 && !Tiro) {
            marcarPosicion(1, 8);
            Tiro = true;
        }
        if (pos9 == 0 && !Tiro) {
            marcarPosicion(1, 9);
            Tiro = true;
        } //System.out.println("recorre");
    }

    void IniciaJuego() {
        Tiro = false;
        fin = false;
        //funcion de utilidad
        boolean gano = ganador(2);
        //comprueba si el usuario gano
        if (gano) {
            JOptionPane.showMessageDialog(null, "¡Felicidades! GANASTE", "", JOptionPane.PLAIN_MESSAGE);
            reiniciar();
            fin = true;
        }
        //esta funcion comprueba si puede Maquina ganar
        if (!Tiro && !fin) {
            verificaUsuario();
        }
        //intenta bloquear los tiros del ususario en caso de que se pueda
        if (!Tiro && !fin) {
            verificaMaquina();
        }
        //tira en el centro en caso de que este vacio
        if (!Tiro && !fin) {
            centro();
        }
        //si no puedo hacer nada de lo anterior
        if (!Tiro && !fin && pos3 == 0) {
            marcarPosicion(1, 3);
            Tiro=true;
        }
        // casillas vacias
        if (!Tiro && !fin) {
            recorrer();
        }
//comprueba si Coputadora gana
        if (Tiro && !fin) {
            //funcion de utilidad
            gano = ganador(1);
            if (gano) {
                JOptionPane.showMessageDialog(null, "Ups Perdiste", "", JOptionPane.PLAIN_MESSAGE);
                reiniciar();
                fin = true;
            }
        }
        if(pos1!=0&&pos2!=0&&pos3!=0&&pos4!=0&&pos5!=0&&pos6!=0&&pos7!=0&&pos8!=0&&pos9!=0){
            JOptionPane.showMessageDialog(null, "Empate Nadie gana" ,"", JOptionPane.PLAIN_MESSAGE);
            reiniciar();
        }
    }
public tictacFrame() {
        initComponents();
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        celda2 = new javax.swing.JButton();
        celda1 = new javax.swing.JButton();
        celda3 = new javax.swing.JButton();
        celda6 = new javax.swing.JButton();
        celda5 = new javax.swing.JButton();
        celda4 = new javax.swing.JButton();
        celda9 = new javax.swing.JButton();
        celda8 = new javax.swing.JButton();
        celda7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(51, 51, 51));

        jPanel1.setPreferredSize(new java.awt.Dimension(272, 274));

        celda2.setBackground(new java.awt.Color(0, 204, 204));
        celda2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        celda2.setForeground(new java.awt.Color(0, 153, 0));
        celda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celda2ActionPerformed(evt);
            }
        });

        celda1.setBackground(new java.awt.Color(0, 204, 204));
        celda1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        celda1.setForeground(new java.awt.Color(0, 153, 0));
        celda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celda1ActionPerformed(evt);
            }
        });

        celda3.setBackground(new java.awt.Color(0, 204, 204));
        celda3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        celda3.setForeground(new java.awt.Color(0, 153, 0));
        celda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celda3ActionPerformed(evt);
            }
        });

        celda6.setBackground(new java.awt.Color(0, 204, 204));
        celda6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        celda6.setForeground(new java.awt.Color(0, 153, 0));
        celda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celda6ActionPerformed(evt);
            }
        });

        celda5.setBackground(new java.awt.Color(0, 204, 204));
        celda5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        celda5.setForeground(new java.awt.Color(0, 153, 0));
        celda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celda5ActionPerformed(evt);
            }
        });

        celda4.setBackground(new java.awt.Color(0, 204, 204));
        celda4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        celda4.setForeground(new java.awt.Color(0, 153, 0));
        celda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celda4ActionPerformed(evt);
            }
        });

        celda9.setBackground(new java.awt.Color(0, 204, 204));
        celda9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        celda9.setForeground(new java.awt.Color(0, 153, 0));
        celda9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celda9ActionPerformed(evt);
            }
        });

        celda8.setBackground(new java.awt.Color(0, 204, 204));
        celda8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        celda8.setForeground(new java.awt.Color(0, 153, 0));
        celda8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celda8ActionPerformed(evt);
            }
        });

        celda7.setBackground(new java.awt.Color(0, 204, 204));
        celda7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        celda7.setForeground(new java.awt.Color(0, 153, 0));
        celda7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celda7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(celda1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celda2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(celda4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celda5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(celda7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celda8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celda3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celda6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celda9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(celda3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celda6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(celda9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celda2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celda5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celda8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celda7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void celda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celda1ActionPerformed
        marcarPosicion(2, 1);
        IniciaJuego();
    }//GEN-LAST:event_celda1ActionPerformed

    private void celda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celda2ActionPerformed
        marcarPosicion(2, 2);
        IniciaJuego();
    }//GEN-LAST:event_celda2ActionPerformed

    private void celda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celda3ActionPerformed
        marcarPosicion(2, 3);
        IniciaJuego();
    }//GEN-LAST:event_celda3ActionPerformed

    private void celda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celda4ActionPerformed
        marcarPosicion(2, 4);
        IniciaJuego();
    }//GEN-LAST:event_celda4ActionPerformed

    private void celda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celda5ActionPerformed
        marcarPosicion(2, 5);
        IniciaJuego();
    }//GEN-LAST:event_celda5ActionPerformed

    private void celda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celda6ActionPerformed
        marcarPosicion(2, 6);
        IniciaJuego();
    }//GEN-LAST:event_celda6ActionPerformed

    private void celda7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celda7ActionPerformed
        marcarPosicion(2, 7);
        IniciaJuego();
    }//GEN-LAST:event_celda7ActionPerformed

    private void celda8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celda8ActionPerformed
        marcarPosicion(2, 8);
        IniciaJuego();
    }//GEN-LAST:event_celda8ActionPerformed

    private void celda9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celda9ActionPerformed
        marcarPosicion(2, 9);
        IniciaJuego();
    }//GEN-LAST:event_celda9ActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new tictacFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton celda1;
    private javax.swing.JButton celda2;
    private javax.swing.JButton celda3;
    private javax.swing.JButton celda4;
    private javax.swing.JButton celda5;
    private javax.swing.JButton celda6;
    private javax.swing.JButton celda7;
    private javax.swing.JButton celda8;
    private javax.swing.JButton celda9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
