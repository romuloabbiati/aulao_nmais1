# This was a lecture provided by DevSuperior on how to fix the N+1 issue

#### SQL tests

```
SELECT * FROM tb_product LIMIT 0,5

SELECT * FROM tb_product LIMIT 5,5

SELECT * FROM tb_product 
	INNER JOIN tb_product_category ON tb_product.id = tb_product_category.product_id
	INNER JOIN tb_category ON tb_category.id = tb_product_category.category_id

SELECT * FROM tb_product 
	INNER JOIN tb_product_category ON tb_product.id = tb_product_category.product_id
	INNER JOIN tb_category ON tb_category.id = tb_product_category.category_id
	LIMIT 0,5

SELECT * FROM tb_product WHERE id IN (1,2,3,4,5)

SELECT * FROM tb_product 
	INNER JOIN tb_product_category ON tb_product.id = tb_product_category.product_id
	INNER JOIN tb_category ON tb_category.id = tb_product_category.category_id
	WHERE tb_product.id IN (1,2,3,4,5)
```  
 
