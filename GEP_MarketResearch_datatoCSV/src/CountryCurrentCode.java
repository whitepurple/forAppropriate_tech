 
 i m p o r t   j a v a . i o . B u f f e r e d R e a d e r ;  
 i m p o r t   j a v a . i o . F i l e ;  
 i m p o r t   j a v a . i o . F i l e N o t F o u n d E x c e p t i o n ;  
 i m p o r t   j a v a . i o . F i l e R e a d e r ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . S e r i a l i z a b l e ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   C o u n t r y C u r r e n t C o d e     i m p l e m e n t s   S e r i a l i z a b l e {  
 	 / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   1 L ;  
 	 p r i v a t e   S t r i n g [ ] [ ]   i n d a t   =   n e w   S t r i n g [ 4 1 0 5 ] [ 5 ] ;  
 	 p u b l i c   H a s h M a p < S t r i n g ,   C o u n t r y >   c o u n t r y L i s t   =   n e w   H a s h M a p < > ( 2 5 0 , 1 ) ;  
 	  
 	 p u b l i c   C o u n t r y C u r r e n t C o d e ( )   {  
 	 	 r e a d C u r r e n t C o d e F i l e ( ) ; 	 / / m� �����T�ܴ  t x t �|�  ���@��  S t r i n g 0�����  ��0� 
 	 	 c r e a t e C o u n t r y I n s t ( ) ; 	 	 / / m� �  tИ���  X՘�)�  ��1� 
 	 }  
 	  
 	 / / m� �����T�ܴ  t x t �|�  ���@��  S t r i n g 0�����  ��0� 
 	 p r i v a t e   v o i d   c r e a t e C o u n t r y I n s t ( )   {  
 	 	 f o r ( S t r i n g [ ]   s   :   i n d a t )   {  
 	 	 	 i f ( ! c o u n t r y L i s t . c o n t a i n s K e y ( s [ 0 ] ) )   {  
 	 	 	 	 c o u n t r y L i s t . p u t ( s [ 0 ] ,   n e w   C o u n t r y ( s [ 0 ] , s [ 2 ] , s [ 1 ] ) ) ;  
 	 	 	 }  
 	 	 	 c o u n t r y L i s t . g e t ( s [ 0 ] ) . a d d C u r r e n t C o d e ( s [ 3 ] ,   s [ 4 ] ) ;  
 	 	 }  
 	 }  
 	  
 	 / / m� �  tИ���  X՘�)�  ��1� 
 	 p r i v a t e   v o i d   r e a d C u r r e n t C o d e F i l e ( )   {  
 	 	   t r y   {  
 	                         / /   c s v   p�t�0�  �|� 
 	 	 	   F i l e   c s v   =   n e w   F i l e ( S a v e L o a d C l a s s . c l a s s . g e t R e s o u r c e ( " " ) . g e t P a t h ( )  
 	 	 	 	 	   + " C o u n t r y   S u b d i v i s i o n   C o d e   F i n a l . t x t " ) ;  
 	 	 	   B u f f e r e d R e a d e r   b r   =   n e w   B u f f e r e d R e a d e r ( n e w   F i l e R e a d e r ( c s v ) ) ;  
 	 	 	   S t r i n g   l i n e   =   " " ;  
 	 	 	   i n t   r o w   = 0   , i ;  
 	 	 	   b r . r e a d L i n e ( ) ;  
 	 	 	   b r . r e a d L i n e ( ) ;  
 	 	 	   w h i l e   ( ( l i n e   =   b r . r e a d L i n e ( ) )   ! =   n u l l )   {  
 	                                 / /   - 1   5�X�@�  ȹ��ɹ  " , "   t���  H�  ��1�ĳ  }�0�  �\�  5�X� 
 	 	 	 	   S t r i n g [ ]   t o k e n   =   l i n e . s p l i t ( " \ t " ) ;  
 	 	 	 	   f o r ( i = 0 ; i < t o k e n . l e n g t h ; i + + )          
 	 	 	 	 	   i n d a t [ r o w ] [ i ]   =   t o k e n [ i ] ;  
 	                                 / /   C S V ���  }Ǵ�  0�����  .�4�  ��̸  U�x�X�0�  �\�  ��%� 
 / / 	 	 	 	   f o r ( i = 0 ; i < 5 ; i + + )          
 / / 	 	 	 	 	   S y s t e m . o u t . p r i n t ( i n d a t [ r o w ] [ i ]   +   " , " ) ;  
 / / 	 	 	 	   S y s t e m . o u t . p r i n t l n ( " " ) ;  
 	 	 	 	   r o w + + ;  
 	 	 	   }  
 	 	 	   b r . c l o s e ( ) ;  
 	 	   }    
 	 	   c a t c h   ( F i l e N o t F o u n d E x c e p t i o n   e )   {  
 	 	 	   e . p r i n t S t a c k T r a c e ( ) ;  
 	 	   }    
 	 	   c a t c h   ( I O E x c e p t i o n   e )   {  
 	 	 	   e . p r i n t S t a c k T r a c e ( ) ;  
 	 	   }  
 	 }  
 	  
 	 / / ���  m� �  tИ���X�  ���  ����T�ܴ|�  ��%�XՔ�  LѤ¸�  T���ܴ 
 	 p u b l i c   v o i d   t e s t ( )   {  
 	 	 c o u n t r y L i s t . e n t r y S e t ( )  
 	 	 	 	 	 . s t r e a m ( )  
 	 	 	 	 	 . m a p ( i   - >   i . g e t V a l u e ( ) )  
 	 	 	 	 	 . s o r t e d ( ( i , j ) - >   i . g e t N a m e ( ) . c o m p a r e T o ( j . g e t N a m e ( ) ) )  
 	 	 	 	 	 . f o r E a c h ( c   - >    
 	 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " \ n " + c . g e t N a m e ( ) ) ;  
 	 	 	 	 	 	 	 	 c . g e t C u r r e n t C o d e s ( ) . s t r e a m ( ) . f o r E a c h ( S y s t e m . o u t : : p r i n t ) ;  
 	 	 	 	 	 	 	 } ) ;  
 	 }  
  
 	 / / ����\�  ��|��  �¸���  ���¸�|�  �X� 
 	 p u b l i c   L i s t < S t r i n g >   s e a r c h C o u n t r y ( S t r i n g   c o u n t r y )   {  
 	 	 H a s h M a p < S t r i n g ,   I n t e g e r >   c n t r y s   =   n e w   H a s h M a p < > ( ) ;  
 	 	 A r r a y L i s t < S t r i n g >   r e s u l t   =   n e w   A r r a y L i s t < > ( ) ;  
 	 	 c o u n t r y L i s t . e n t r y S e t ( )  
 	 	 	 	 	 . s t r e a m ( )  
 	 	 	 	 	 . m a p ( h   - >   h . g e t V a l u e ( ) ) 	 / / ��|�� 
 	 	 	 	 	 . f o r E a c h ( k   - >   {  
 	 	 	 	 	 	 	 	 k . g e t C u r r e n t C o d e s ( ) 	 / / �  ����T�ܴ  ���� 
 	 	 	 	 	 	 	 	 	 . s t r e a m ( )  
 	 	 	 	 	 	 	 	 	 . m a p ( m   - >   m . s p l i t ( " , " ) [ 1 ] )  
 	 	 	 	 	 	 	 	 	 . f i l t e r ( f   - >   f . t o L o w e r C a s e ( ) . i n d e x O f ( c o u n t r y ) > - 1 ) 	 	 / / ȵ� 
 	 	 	 	 	 	 	 	 	 . f o r E a c h ( c c   - >   c n t r y s . p u t ( c c + "   o f   [ " + k . g e t N a m e ( ) + " ] " , 	 / / 8����� 
 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 c c . t o L o w e r C a s e ( ) . i n d e x O f ( c o u n t r y ) ) ) ;  
 	 	 	 	 	 	 	 	 i f ( k . g e t N a m e ( ) . t o L o w e r C a s e ( ) . i n d e x O f ( c o u n t r y ) > - 1 ) 	 / / m� �  tǄ�̹  ���� 
 	 	 	 	 	 	 	 	 	 c n t r y s . p u t ( k . g e t N a m e ( ) ,    
 	 	 	 	 	 	 	 	 	 	 	 k . g e t N a m e ( ) . t o L o w e r C a s e ( ) . i n d e x O f ( c o u n t r y ) ) ;  
 	 	 	 	 	 	 	 } ) ;  
 	 	 i f ( c n t r y s . s i z e ( ) = = 0 )  
 	 	 	 r e t u r n   L i s t . o f ( " N o   R e s u l t " ) ;  
 	 	  
 	 	 c n t r y s . e n t r y S e t ( )  
 	 	 	 . s t r e a m ( ) 	 / / �|�  |�X�XՔ�  �<�\�  �,� 
 	 	 	 . s o r t e d ( ( i , j ) - >   i . g e t V a l u e ( ) . c o m p a r e T o ( j . g e t V a l u e ( ) ) )  
 	 	 	 . m a p ( k   - >   k . g e t K e y ( ) )  
 	 	 	 . f o r E a c h ( l   - >   r e s u l t . a d d ( l . r e p l a c e A l l ( " \ " " ,   " " ) ) ) ;  
 	 	 / / \� �  5 �L���  ��%� 
 	 	 r e t u r n   r e s u l t . s u b L i s t ( 0 ,   M a t h . m i n ( r e s u l t . s i z e ( ) , 5 ) ) ;  
 	 }  
 }  
 