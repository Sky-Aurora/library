package com.ruoyi.lottery.service;

import java.util.List;
import com.ruoyi.lottery.domain.BookSale;

/**
 * 借阅记录Service接口
 * 
 * @author Shawn
 * @date 2024-03-05
 */
public interface IBookSaleService 
{
    /**
     * 查询借阅记录
     * 
     * @param id 借阅记录主键
     * @return 借阅记录
     */
    public BookSale selectBookSaleById(Long id);

    /**
     * 查询借阅记录列表
     * 
     * @param bookSale 借阅记录
     * @return 借阅记录集合
     */
    public List<BookSale> selectBookSaleList(BookSale bookSale);

    /**
     * 新增借阅记录
     * 
     * @param bookSale 借阅记录
     * @return 结果
     */
    public int insertBookSale(BookSale bookSale);

    /**
     * 修改借阅记录
     * 
     * @param bookSale 借阅记录
     * @return 结果
     */
    public int updateBookSale(BookSale bookSale);

    /**
     * 批量删除借阅记录
     * 
     * @param ids 需要删除的借阅记录主键集合
     * @return 结果
     */
    public int deleteBookSaleByIds(String ids);

    /**
     * 删除借阅记录信息
     * 
     * @param id 借阅记录主键
     * @return 结果
     */
    public int deleteBookSaleById(Long id);
}
