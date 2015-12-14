����   4 �  ui/Arrow_Test  javax/swing/JPanel   javax/swing/event/ChangeListener WIND_MIN I ConstantValue     WIND_MAX  h 	WIND_INIT    theta D arrow Ljava/awt/geom/Path2D; <init> ()V Code
    	      ui/Arrow_Test$Arrow
     (Lui/Arrow_Test;)V	      LineNumberTable LocalVariableTable this Lui/Arrow_Test; stateChanged "(Ljavax/swing/event/ChangeEvent;)V
 ( * ) javax/swing/event/ChangeEvent + , 	getSource ()Ljava/lang/Object; . javax/swing/JSlider
 - 0 1 2 getValue ()I
 4 6 5 java/lang/Math 7 8 	toRadians (D)D
  : ;  repaint e Ljavax/swing/event/ChangeEvent; value paintComponent (Ljava/awt/Graphics;)V
  B ? @ D java/awt/Graphics2D	 F H G java/awt/RenderingHints I J KEY_ALPHA_INTERPOLATION Ljava/awt/RenderingHints$Key;	 F L M N !VALUE_ALPHA_INTERPOLATION_QUALITY Ljava/lang/Object;
 C P Q R setRenderingHint 2(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V	 F T U J KEY_ANTIALIASING	 F W X N VALUE_ANTIALIAS_ON	 F Z [ J KEY_COLOR_RENDERING	 F ] ^ N VALUE_COLOR_RENDER_QUALITY	 F ` a J KEY_DITHERING	 F c d N VALUE_DITHER_ENABLE	 F f g J KEY_FRACTIONALMETRICS	 F i j N VALUE_FRACTIONALMETRICS_ON	 F l m J KEY_INTERPOLATION	 F o p N VALUE_INTERPOLATION_BILINEAR	 F r s J KEY_RENDERING	 F u v N VALUE_RENDER_QUALITY	 F x y J KEY_STROKE_CONTROL	 F { | N VALUE_STROKE_PURE ~ java/awt/BasicStroke@�  
 } �  � (F)V
 C � � � 	setStroke (Ljava/awt/Stroke;)V
  � � 2 getWidth
 � � � java/awt/geom/Path2D � � 	getBounds ()Ljava/awt/Rectangle;
 � � � java/awt/Rectangle � � ()D@       
  � � 2 	getHeight
 � � � � � java/awt/geom/AffineTransform
 � 
 � � � � 	translate (DD)V
 � � � � rotate (DDD)V
 C � � � setTransform "(Ljava/awt/geom/AffineTransform;)V
 C � � � draw (Ljava/awt/Shape;)V
 C � �  dispose g Ljava/awt/Graphics; gr Ljavax/swing/JPanel; g2d Ljava/awt/Graphics2D; x y at Ljava/awt/geom/AffineTransform; 	getSlider ()Ljavax/swing/JSlider;
 - �  � (IIII)V
 - � � � setMajorTickSpacing (I)V
 - � � � setMinorTickSpacing
 - � � � setPaintTicks (Z)V
 - � � � setPaintLabels
 - � � � addChangeListener %(Ljavax/swing/event/ChangeListener;)V slider Ljavax/swing/JSlider; 
SourceFile Arrow_Test.java InnerClasses � java/awt/RenderingHints$Key Key Arrow !          	    
     	         	                         L     *� *� *� Y*� � �    !       
   	   
 "        # $    % &     c     +� '� -� /=*�� 3� *� 9�    !              "         # $      < =    >    ? @    � 	 	   �*+� A� Y� M+� CN-� E� K� O-� S� V� O-� Y� \� O-� _� b� O-� e� h� O-� k� n� O-� q� t� O-� w� z� O-� }Y� �� �*� ��*� � �� �g �o9*� ��*� � �� �g �o9� �Y� �:� �*� *� � �� � �o*� � �� � �o� �-� �-*� � �-� ��    !   V             &  0   : ! D " N # X $ b & o ( � ) � + � , � - � . � 0 � 1 � 3 "   H    � # $     � � �   � � �   � � �  � ` �   � J �   � A � �    � �          +� -Yh� �L+<� �+� �+� �+� �+*� �+�    !   & 	   6  7  6  8  9  :  ; $ < ) = "       + # $     � �   �    � �     � F �	   � 