package com.sh.shop_kick_n_go.product.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRegistDto {

    private Category category;
    private String productName;
    private int price;
    private int size;
    private String color;
    private int inventoryQuantity;
    private MultipartFile image;
    private Material material;
    public ProductDto toProductDto(String uniqueFileUrl) {
        return new ProductDto(this.category, this.productName, this.price, this.size, this.color, this.inventoryQuantity, uniqueFileUrl, this.material);
    }
}