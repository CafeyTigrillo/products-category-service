package com.mipagina.products_category_service.controller;

import com.mipagina.products_category_service.model.Product;
import com.mipagina.products_category_service.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Product", description = "Restaurant product management APIs")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Operation(
            summary = "Get products by category ID",
            description = "Retrieve all food products that belong to a specific category in the restaurant menu, identified by its ID."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Successfully retrieved the products",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Product.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Category not found",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal server error",
                    content = @Content
            )
    })
    @GetMapping("/products/{id_category}")
    public List<Product> getProductsCategoryById(
            @Parameter(description = "Unique identifier of the category to retrieve food products for", example = "2")
            @PathVariable Long id_category
    ) {
        return productService.getProductsCategoryById(id_category);
    }
}