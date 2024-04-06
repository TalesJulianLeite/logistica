package com.leite.tales.integracaologistica.repository.impl;


import com.leite.tales.integracaologistica.domain.Order;
import com.leite.tales.integracaologistica.dto.response.OrderDTOResponse;
import com.leite.tales.integracaologistica.repository.IOrder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository implements IOrder {


  @Override
  public <S extends Order> S save(S entity) {
    return this.save(entity);
  }

  @Override
  public <S extends Order> List<S> saveAll(Iterable<S> entities) {
    return saveAll(entities);
  }

  /**
   * @param aLong must not be {@literal null}. 
   * @return
   */
  @Override
  public Optional<Order> findById(Long aLong) {
    return Optional.empty();
  }

  /**
   * @param aLong must not be {@literal null}. 
   * @return
   */
  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  /**
   * @return 
   */
  @Override
  public List<Order> findAll() {
    return null;
  }

  /**
   * @param longs must not be {@literal null} nor contain any {@literal null} values. 
   * @return
   */
  @Override
  public List<Order> findAllById(Iterable<Long> longs) {
    return null;
  }

  /**
   * @return 
   */
  @Override
  public long count() {
    return 0;
  }

  /**
   * @param aLong must not be {@literal null}. 
   */
  @Override
  public void deleteById(Long aLong) {

  }

  /**
   * @param entity must not be {@literal null}. 
   */
  @Override
  public void delete(Order entity) {

  }

  /**
   * @param longs must not be {@literal null}. Must not contain {@literal null} elements. 
   */
  @Override
  public void deleteAllById(Iterable<? extends Long> longs) {

  }

  /**
   * @param entities must not be {@literal null}. Must not contain {@literal null} elements. 
   */
  @Override
  public void deleteAll(Iterable<? extends Order> entities) {

  }

  /**
   * 
   */
  @Override
  public void deleteAll() {

  }

  @Override
  public List<Order> findAll(Sort sort) {
    return findAll(sort);
  }

  @Override
  public Page<Order> findAll(Pageable pageable) {
    return this.findAll(pageable);
  }

  @Override
  public <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable) {
    return this.findAll(example, pageable);
  }

  /**
   * @param example the {@link Example} to count instances for. Must not be {@literal null}. 
   * @param <S>
   * @return
   */
  @Override
  public <S extends Order> long count(Example<S> example) {
    return 0;
  }

/**
*
 * @param example the {@link Example} to use for the existence check. Must not be {@literal null}.
 * @return
 * @param <S>
*/
  @Override
  public <S extends Order> boolean exists(Example<S> example) {
    return false;
  }

  @Override
  public <S extends Order, R> R findBy(Example<S> example,
      Function<FetchableFluentQuery<S>, R> queryFunction) {
    return null;
  }

  /**
   * @param filterName 
   * @param filterValue
   * @return
   */
  @Override
  public List<Order> findOrderbyFilter(String filterName, String filterValue) {
    return null;
  }

  /**
   * 
   */
  @Override
  public void flush() {

  }

  /**
   * @param entity entity to be saved. Must not be {@literal null}. 
   * @param <S>
   * @return
   */
  @Override
  public <S extends Order> S saveAndFlush(S entity) {
    return null;
  }

  /**
   * @param entities entities to be saved. Must not be {@literal null}. 
   * @param <S>
   * @return
   */
  @Override
  public <S extends Order> List<S> saveAllAndFlush(Iterable<S> entities) {
    return null;
  }

  /**
   * @param entities entities to be deleted. Must not be {@literal null}. 
   */
  @Override
  public void deleteAllInBatch(Iterable<Order> entities) {

  }

  /**
   * @param longs the ids of the entities to be deleted. Must not be {@literal null}. 
   */
  @Override
  public void deleteAllByIdInBatch(Iterable<Long> longs) {

  }

  /**
   * 
   */
  @Override
  public void deleteAllInBatch() {

  }

  /**
   * @param aLong must not be {@literal null}. 
   * @return
   */
  @Override
  public Order getOne(Long aLong) {
    return null;
  }

  /**
   * @param aLong must not be {@literal null}. 
   * @return
   */
  @Override
  public Order getById(Long aLong) {
    return null;
  }

  /**
   * @param aLong must not be {@literal null}. 
   * @return
   */
  @Override
  public Order getReferenceById(Long aLong) {
    return null;
  }

  /**
   * @param example must not be {@literal null}. 
   * @param <S>
   * @return
   */
  @Override
  public <S extends Order> Optional<S> findOne(Example<S> example) {
    return Optional.empty();
  }

  /**
   * @param example must not be {@literal null}. 
   * @param <S>
   * @return
   */
  @Override
  public <S extends Order> List<S> findAll(Example<S> example) {
    return null;
  }

  /**
   * @param example must not be {@literal null}. 
   * @param sort    the {@link Sort} specification to sort the results by, may be
   *                {@link Sort#unsorted()}, must not be {@literal null}.
   * @param <S>
   * @return
   */
  @Override
  public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {
    return null;
  }
}
