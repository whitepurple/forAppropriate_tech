 
 i m p o r t   j a v a . i o . F i l e O u t p u t S t r e a m ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . O u t p u t S t r e a m ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
  
 / / ��l�d���D�  ��t�  �ŴŸ�  C S V ���X�  �|�D�  t x t U֥ǐ�\�  �|�   ȥ�.  
 / / t x t �|�\�   ȥ�\�  �|�D�  ��@����  p�t�0�  MѤ¸�\�  ���@�   �ȲT�ܴ  8�����\�   ȥ� 
 / / U T F - 1 6 L E ���� 
  
 p u b l i c   c l a s s   t o T x t F i l e   {  
 	 p r i v a t e   s t a t i c   t o T x t F i l e   u n i q u e I n s t a n c e   =   n u l l ;  
 	 p r i v a t e   t o T x t F i l e ( )   { }  
 	 p u b l i c   s t a t i c   t o T x t F i l e   g e t T o T x t F i l e ( )   {  
 	 	 i f ( u n i q u e I n s t a n c e = = n u l l )   u n i q u e I n s t a n c e   =   n e w   t o T x t F i l e ( ) ;  
 	 	 r e t u r n   u n i q u e I n s t a n c e ;  
 	 }  
 	  
 	 p u b l i c   v o i d   s t r i n g s T o T x t ( A r r a y L i s t < S t r i n g >   s t r i n g s )   t h r o w s   I O E x c e p t i o n   {  
         	 O u t p u t S t r e a m   o u t p u t   =   n e w   F i l e O u t p u t S t r e a m ( " C : / U s e r s / u s e r / D e s k t o p / g e p / C o u n t r y   S u b d i v i s i o n   C o d e . t x t " ) ;  
         	 s t r i n g s . s t r e a m ( ) . f o r E a c h O r d e r e d ( s   - >   {  
 	 	 	 t r y   {  
 	 	 	 	 o u t p u t . w r i t e ( s . g e t B y t e s ( ) ) ;  
 	 	 	 }   c a t c h   ( I O E x c e p t i o n   e )   {  
 	 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 	 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 }  
 	 	 } ) ;  
         	 o u t p u t . c l o s e ( ) ; 	  
         }  
 }  
 