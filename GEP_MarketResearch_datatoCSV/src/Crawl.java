 
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
  
 i m p o r t   o r g . j s o u p . J s o u p ;  
 i m p o r t   o r g . j s o u p . n o d e s . D o c u m e n t ;  
 i m p o r t   o r g . j s o u p . n o d e s . E l e m e n t ;  
 i m p o r t   o r g . j s o u p . s e l e c t . E l e m e n t s ;  
  
 / / ��l�d���D�  tǩ�X���  m� �ļ  ����T�ܴ|�  �D�@�  �¸���  ���tǬ��¸���   ȥ� 
 / / ��  l�d���<�\�  Ȁ�  �D�$�0��Ŕ�  �x�  ���X�  ���� �  ιD�� 
 / / l�d���t�  ���  J�@�  ��8���  ����@�  ��<�\�  ���  ���� 
 / /  
 / / t��  ����X���  J�D�ĳ  ���  tИ��� 
  
 p u b l i c   c l a s s   C r a w l   {  
 	 p r i v a t e   s t a t i c   C r a w l   u n i q u e I n s t a n c e   =   n u l l ;  
 	 p r i v a t e   C r a w l ( )   { t o T e x t F i l e   =   n e w   A r r a y L i s t < S t r i n g > ( ) ; }  
 	 p r i v a t e   A r r a y L i s t < S t r i n g >   t o T e x t F i l e ;  
 	 p u b l i c   s t a t i c   C r a w l   g e t C r a w l e r ( )   {  
 	 	 i f ( u n i q u e I n s t a n c e = = n u l l )   u n i q u e I n s t a n c e   =   n e w   C r a w l ( ) ;  
 	 	 r e t u r n   u n i q u e I n s t a n c e ;  
 	 }  
  
 	 p u b l i c   v o i d   g e t W e b ( )   t h r o w s   I O E x c e p t i o n   {  
 	 	 / / D o c u m e n t �Ŕ�  ��t���X�  ȴ�  ���� �   ȥ��� 
 	 	 D o c u m e n t   d o c   =   J s o u p . c o n n e c t ( " h t t p s : / / c o u n t r y - c o d e . c l " ) . g e t ( ) ;  
 	 	  
 	 	 / / s e l e c t |�  tǩ�X���  ��XՔ�  ����|�   ���\��.   s e l e c t ��  ��XՔ�  �D�   �8�$�0�  �\�  ɔ�\�  0���t��.  
 	 	 	  
 	 	 E l e m e n t s   e l e m e n t   =   d o c . s e l e c t ( " t a b l e # c o u n t r i e s T a b l e   > t b o d y > t r " ) ;  
 	 	 E l e m e n t s   e l e m   =   n u l l ;  
 	 	 D o c u m e n t   w i k i   =   n u l l ;  
 	 	 S t r i n g   c u r r e n t C o d e U R L   =   n u l l ;  
 	 	 A r r a y L i s t < C o u n t r y >   c o u n t r y L i s t   =   n e w   A r r a y L i s t < C o u n t r y > ( ) ;  
 	 	  
 	 	 f o r ( E l e m e n t   e l   :   e l e m e n t )   {  
 	 	 	 C o u n t r y   c   =   n e w   C o u n t r y ( e l . s e l e c t ( " a > i m g " ) . a t t r ( " t i t l e " ) ,  
 	 	 	 	 	 	 	 	 	 	 e l . s e l e c t ( " # s 0 e 2 7 7 0 4 " ) . t e x t ( ) ,  
 	 	 	 	 	 	 	 	 	 	 e l . s e l e c t ( " t d " ) . f i r s t ( ) . t e x t ( ) ) ;  
 	 	 	 c o u n t r y L i s t . a d d ( c ) ;  
 	 	 	  
 	 	 	 / / S y s t e m . o u t . p r i n t l n (  
 	 	 	 / / t o T e x t F i l e . a d d ( c . g e t I n f o ( ) ) ;  
 	 	 	  
 	 	 	 c u r r e n t C o d e U R L   =   e l . s e l e c t ( " # s 0 e 2 7 7 0 4 " ) . a t t r ( " a b s : h r e f " ) ;  
 	 	 	 w i k i   =   J s o u p . c o n n e c t ( c u r r e n t C o d e U R L ) . g e t ( ) ;  
 	 	 	 e l e m   =   w i k i . s e l e c t ( " h 2 : h a s ( s p a n # C u r r e n t _ c o d e s )   ~   . w i k i t a b l e " ) ; / / ( " t r : h a s ( t d   . m w - r e d i r e c t ) " ) ;  
  
 	 	 	 i f ( e l e m . s i z e ( ) = = 0 )   {  
 	 	 	 	 t o T e x t F i l e . a d d ( c . g e t I n f o ( ) + " \ n " ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( c . g e t I n f o ( ) ) ;  
 	 	 	 }  
 	 	 	 f o r ( E l e m e n t   c o d e   :   e l e m . e q ( 0 ) . s e l e c t ( " t b o d y > t r : g t ( 0 ) " ) )   {  
 	 	 	 	 c . a d d C u r r e n t C o d e ( c o d e . s e l e c t ( " t d : e q ( 1 ) " ) . t e x t ( ) . t r i m ( ) ,  
 	 	 	 	 	 	 	 	 	 c o d e . s e l e c t ( " t d : e q ( 0 ) " ) . t e x t ( ) . t r i m ( ) ) ;  
 	 	 	 }  
 	 	 	 c . g e t C u r r e n t C o d e s ( ) . s t r e a m ( ) . f o r E a c h ( i   - >   t o T e x t F i l e . a d d ( c . g e t I n f o ( ) + i ) ) ; / / S y s t e m . o u t : : p r i n t ) ;  
 	 	 	 / / S y s t e m . o u t . p r i n t l n (  
 	 	 	 / / t o T e x t F i l e . a d d ( " \ n " + c . g e t C u r r e n t C o d e s ( ) . s i z e ( ) ) ;  
 	 	 }  
 	 }  
 	 p u b l i c   A r r a y L i s t < S t r i n g >   g e t T o T e x t F i l e ( ) {  
 	 	 r e t u r n   t o T e x t F i l e ;  
 	 }  
 	 / / ���D�  H� �8�@�8��  0�\�  ̹���L� 
 	 p u b l i c   v o i d   r u s ( )   t h r o w s   I O E x c e p t i o n   {  
 	 	 D o c u m e n t   d o c   =   J s o u p . c o n n e c t ( " h t t p s : / / e n . w i k i p e d i a . o r g / w i k i / I S O _ 3 1 6 6 - 2 : R U " ) . g e t ( ) ;  
 	 	 E l e m e n t s   e l e m   =   d o c . s e l e c t ( " h 2 : h a s ( s p a n # C u r r e n t _ c o d e s )   ~   . w i k i t a b l e " ) ;  
 	 	 f o r ( E l e m e n t   c o d e   :   e l e m . e q ( 0 ) . s e l e c t ( " t b o d y > t r : g t ( 0 ) " ) )   {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " \ " " + c o d e . s e l e c t ( " t d : e q ( 1 ) " ) . t e x t ( ) . t r i m ( ) + " \ " , " +  
 	 	 	 	 	 	 	 	 c o d e . s e l e c t ( " t d : e q ( 0 ) " ) . t e x t ( ) . t r i m ( ) ) ;  
 	 	 }  
 	 }  
 }  
 