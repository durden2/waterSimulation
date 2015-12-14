����   4 �  ui/Interface  java/awt/Frame  java/awt/event/ActionListener lblInput Ljavax/swing/JLabel; tfInput Ljavax/swing/JTextField; tfOutput numberIn I sum WIND_MIN ConstantValue     WIND_MAX   2 	WIND_INIT    <init> ()V Code
    	      javax/swing/JFrame
  
  ! " # setDefaultCloseOperation (I)V % java/awt/FlowLayout
 $ 
  ( ) * 	setLayout (Ljava/awt/LayoutManager;)V , javax/swing/JPanel
 +  / javax/swing/BoxLayout
 . 1  2 (Ljava/awt/Container;I)V
 + ( 5 java/awt/Dimension
 4 7  8 (II)V
 : < ; javax/swing/Box = > createRigidArea *(Ljava/awt/Dimension;)Ljava/awt/Component;
 + @ A B add *(Ljava/awt/Component;)Ljava/awt/Component; D javax/swing/JLabel F Wybierz siłę wiatru: 
 C H  I (Ljava/lang/String;)V	  K   M javax/swing/JTextField
 L O  #	  Q 	 

 L S T U addActionListener "(Ljava/awt/event/ActionListener;)V W javax/swing/JSlider
 V Y  Z (IIII)V
 V \ ] # setMajorTickSpacing
 V _ ` # setMinorTickSpacing
 V b c d setPaintTicks (Z)V
 V f g d setPaintLabels i ui/Interface$1stateChanged
 h k  l (Lui/Interface;)V
 V n o p addChangeListener %(Ljavax/swing/event/ChangeListener;)V r ui/Arrow_Test
 q 
 q u v w 	getSlider ()Ljavax/swing/JSlider; y Last
 + { A | )(Ljava/awt/Component;Ljava/lang/Object;)V
  ~  � getContentPane ()Ljava/awt/Container;
 � @ � java/awt/Container � Symulator fal
  � � I setTitle
  � � 8 setSize
  � �  pack
  � � d 
setVisible LineNumberTable LocalVariableTable this Lui/Interface; f Ljavax/swing/JFrame; listPane Ljavax/swing/JPanel; wind 	windSpeed Ljavax/swing/JSlider; arrow test Lui/Arrow_Test; main ([Ljava/lang/String;)V
   args [Ljava/lang/String; actionPerformed (Ljava/awt/event/ActionEvent;)V
 L � � � getText ()Ljava/lang/String;
 � � � java/lang/Integer � � parseInt (Ljava/lang/String;)I	  �   �  
 L � � I setText	  �  
 � java/lang/StringBuilder
 � � � java/lang/String � � valueOf (I)Ljava/lang/String;
 � H
 � � � � toString evt Ljava/awt/event/ActionEvent; 
SourceFile Interface.java InnerClasses stateChanged !            	 
     
                                                    .*� *� � Y� L+�  +� $Y� &� '� +Y� -M,� .Y,� 0� 3,� 4Y� 6� 9� ?W� +Y� -N*� CYE� G� J*� LY
� N� P*� P*� R-� .Y-� 0� 3� VY2� X:
� [� ^� a� e� hY*� j� m-*� J� ?W-� ?W� +Y� -:� .Y� 0� 3� qY� s:� ?W� tx� z+� }� �W+� }-� �W+� },� �W+�� �+  � �+� �+� ��    �   � $      	 '  (  ) ! . ) / 6 0 G 3 O 4 \ 5 i 6 q 7 ~ 9 � : � 9 � < � = � > � ? � @ � B � C � I � J � L � N � O � R S T V W$ X( Y- Z �   H   . � �    � �  ) � �  O � � �  � � � �  � b � �  � J � �  	 � �     5     � � ��    �   
    \  ] �        � �    � �     �     =**� P� �� �� �*Y� *� �`� *� P�� �*� �� �Y*� � �� ¶ ö ��    �       b  c  d $ e < g �       = � �     = � �   �    � �   
  h   �  