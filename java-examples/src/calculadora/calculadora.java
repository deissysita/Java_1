package calculadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class calculadora extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String teclado="0",operacion;
    int num1,num2,sumar,restar,mult,divi;
    public calculadora() {
        initComponents();
    }
  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado = new javax.swing.JTextField();
        numeros = new javax.swing.JTextField();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        div = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        operaciones.add("+");
        operaciones.add("-");
        operaciones.add("/");
        operaciones.add("*");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultado.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        numeros.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        numeros.setText("0");
        numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerosActionPerformed(evt);
            }
        });

        suma.setBackground(new java.awt.Color(204, 255, 255));
        suma.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setBackground(new java.awt.Color(204, 255, 255));
        resta.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multi.setBackground(new java.awt.Color(204, 255, 255));
        multi.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        multi.setText("*");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        div.setBackground(new java.awt.Color(204, 255, 255));
        div.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(204, 255, 255));
        clear.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        clear.setText("CE");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        enter.setBackground(new java.awt.Color(204, 255, 255));
        enter.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(204, 255, 255));
        siete.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(204, 255, 255));
        ocho.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(204, 255, 255));
        nueve.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(204, 255, 255));
        cuatro.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(204, 255, 255));
        cinco.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(204, 255, 255));
        seis.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(204, 255, 255));
        uno.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(204, 255, 255));
        dos.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(204, 255, 255));
        tres.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(204, 255, 255));
        cero.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        punto.setBackground(new java.awt.Color(204, 255, 255));
        punto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        clear1.setBackground(new java.awt.Color(204, 255, 255));
        clear1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        clear1.setText("C");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(numeros))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(siete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cero, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                            .addComponent(cinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(punto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enter)
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(91, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suma)
                    .addComponent(resta)
                    .addComponent(multi)
                    .addComponent(div))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear)
                            .addComponent(ocho)
                            .addComponent(nueve))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cinco)
                            .addComponent(seis)
                            .addComponent(enter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dos)
                            .addComponent(tres)
                            .addComponent(clear1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cero)
                            .addComponent(punto)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(siete)
                        .addGap(9, 9, 9)
                        .addComponent(cuatro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uno)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
    	teclado=teclado+"+";
    	numeros.setText(teclado);
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
    	teclado=teclado+"-";
    	numeros.setText(teclado);
    }//GEN-LAST:event_restaActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
    	teclado=teclado+"*";
    	numeros.setText(teclado);
    }//GEN-LAST:event_multiActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
    	teclado=teclado+"/";
    	numeros.setText(teclado);
    }//GEN-LAST:event_divActionPerformed
 
  
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        String cadena;
        cadena=numeros.getText();
        
        if(cadena.length()>0){
        	teclado=cadena.substring(0, cadena.length()-1);
            numeros.setText(teclado);
        }
            
    }//GEN-LAST:event_clearActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
    	validarTextoCero();
    	teclado=teclado+"0";
        numeros.setText(teclado);
    }//GEN-LAST:event_ceroActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
    	validarTextoCero();
    	teclado=teclado+"1";
        numeros.setText(teclado);
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
    	validarTextoCero();
    	teclado=teclado+"2";
        numeros.setText(teclado);
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
    	validarTextoCero();
    	teclado=teclado+"3";
       numeros.setText(teclado);
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
    	validarTextoCero();
    	teclado=teclado+"4";
        numeros.setText(teclado);
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
    	validarTextoCero();
    	teclado=teclado+"5";
        numeros.setText(teclado);
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
    	validarTextoCero();
    	teclado=teclado+"6";
        numeros.setText(teclado);
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
    	validarTextoCero();
    	teclado=teclado+"7";
        numeros.setText(teclado);
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
    	validarTextoCero();
    	teclado=teclado+"8";
        numeros.setText(teclado);
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
    	validarTextoCero();
    	teclado=teclado+"9";
        numeros.setText(teclado);
    }//GEN-LAST:event_nueveActionPerformed

    private void numerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerosActionPerformed
        System.out.println();
    }//GEN-LAST:event_numerosActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        String cadena;
        
        cadena=numeros.getText();
        
        if (cadena.length()<=0){
        	teclado="0.";
        	numeros.setText(teclado);
        }
        else
            if(!existepunto(numeros.getText())) {
            	teclado=numeros.getText()+".";
        numeros.setText(teclado);
        }
    }//GEN-LAST:event_puntoActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        teclado="0";    
    	numeros.setText(teclado);
    }//GEN-LAST:event_clear1ActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        //calculo de operaciones
    	double res=0;
    	ArrayList<String> factor = new ArrayList<String>();
    	ArrayList<String> factorAux = new ArrayList<String>();
    	char c;
    	int ant=0;
    	String termino="", termino2="";
    	
    	//Separamos los factores
    	for (int n = 0; n <teclado.length (); n++) { 
    		c = teclado.charAt(n);
    		if(operaciones.contains(String.valueOf(c))) {
    			if(n>0) {
    			factor.add(teclado.substring(ant, n));
    			}
    			factor.add(String.valueOf(c));
    			ant=n+1;
    		}
    	}
    	factor.add(teclado.substring(ant, teclado.length()));
    	Iterator<String> it = factor.iterator();
    	// Multiplicaciones y divisiones
    	
    	while(it.hasNext()){
    		termino=it.next();
    		if(!termino.equals("-")) {
		    	if(it.hasNext()) {
		    		termino2=it.next();
		    		if(termino2.equals("*")) {
		    			termino2=it.next();
		    			res=Double.parseDouble(termino)*Double.parseDouble(termino2);
		    			factorAux.add(String.valueOf(res));
		    		}else if(termino2.equals("/")) {
		    			termino2=it.next();
		    			res=Double.parseDouble(termino)/Double.parseDouble(termino2);
		    			factorAux.add(String.valueOf(res));
		    		}else {
		    			factorAux.add(String.valueOf(termino));
		    			factorAux.add(String.valueOf(termino2));
		    		}
	    		}else {
	    			factorAux.add(String.valueOf(termino));
	    		}
    		}else {
    			factorAux.add(String.valueOf(termino));
    		}
    	}
    	
    	it = factorAux.iterator();
    	termino=it.next();
		if(termino.equals("-")) {
			termino=it.next();
			res=0-Double.parseDouble(termino);
		}else {
			res=Double.parseDouble(termino);
		}
    	
    	// Sumas y restas
    	while(it.hasNext()){
    		termino=it.next();
    		if(termino.equals("+")) {
    			termino2=it.next();
    			res=res+Double.parseDouble(termino2);
    		}else if(termino.equals("-")) {
    			termino2=it.next();
    			res=res-Double.parseDouble(termino2);
    		}
    	}
    	
    	resultado.setText(String.valueOf(res));
    	teclado=String.valueOf(res);    
    	numeros.setText(teclado);
    }//GEN-LAST:event_sieteActionPerformed
    
    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerosActionPerformed
        System.out.println();
    }//GEN-LAST:event_numerosActionPerformed
    public static boolean existepunto(String cadena){
        boolean resulta;
        resulta=false;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.substring(1, i+1).equals(".")){
                resulta=true;
                break;
            }
            
        }
         return resulta;
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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }
    private void validarTextoCero() {
    	if (teclado.equals("0")) {
        	teclado="";
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton div;
    private javax.swing.JButton dos;
    private javax.swing.JButton enter;
    private javax.swing.JButton multi;
    private javax.swing.JButton nueve;
    private javax.swing.JTextField numeros;
    private javax.swing.JButton ocho;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton suma;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    private List<String> operaciones = new ArrayList<String>();
    // End of variables declaration//GEN-END:variables
}
