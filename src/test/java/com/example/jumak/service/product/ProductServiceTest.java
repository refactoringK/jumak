package com.example.jumak.service.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.ProductDetailVo;
import com.example.jumak.domain.vo.product.ProductListVo;
import com.example.jumak.mapper.product.ProductMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;


@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @Mock
    ProductMapper productMapper;
    @InjectMocks
    ProductService productService;

    ProductDto productDto;
    ProductDetailVo productDetailVo;

    @BeforeEach
    void setUp(){
        productDto = new ProductDto();
        productDetailVo = new ProductDetailVo();
    }

    @Test
    void findByNumber() {
        // given
        doReturn(Optional.ofNullable(productDto)).when(productMapper).selectByNumber(any());
        // when
        ProductDto foundProduct = productService.findByNumber(30L);
        // then
        assertThat(foundProduct).isEqualTo(productDto);
    }

/*    @Test
    void findByCategory() {
        // given
            doReturn(List.of(productDto)).when(productMapper).selectByCategory(any());
        // when
        List<ProductDto> foundCategory = productService.findByCategory(1L);
        // then
        assertThat(foundCategory).isEqualTo(productDto);
    }*/

    @Test
    void findAll() {
//        // given
//            doReturn(List.of(productDto)).when(productMapper).selectAll();
//        // when
//        List<ProductListVo> productList = productService.findAll();
//        // then
//        assertThat(productList).contains(productDto);
    }

    @Test
    void findByDNumber() {
        //given
        doReturn(Optional.ofNullable(productDetailVo)).when(productMapper).selectByDNumber(any());
        //when
        ProductDetailVo foundDNumber = productService.findByDNumber(26L);
        //then
        assertThat(foundDNumber).isEqualTo(productDetailVo);
    }

    @Test
    void findByDImg() {
        // given
        Mockito.doReturn(List.of(productDetailVo)).when(productMapper).selectByDImg(26L);
        // when
        List<ProductDetailVo> byDImgList = productService.findByDImg(26L);
        // then
        assertThat(byDImgList).contains(productDetailVo);
    }

/*    @Test
    void findByDetail() {
        // given
            doReturn(List.of(productDetailVo)).when(productMapper).selectByDetail();
        // when
        List<ProductDetailVo> productDetailList = productService.findByDetail();
        // then
        Assertions.assertThat(productDetailList).contains(productDetailVo);
    }*/
}
