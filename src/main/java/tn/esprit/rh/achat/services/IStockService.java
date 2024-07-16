package tn.esprit.rh.achat.services;

import tn.esprit.rh.achat.entities.Stock;

import java.util.List;

public interface IStockService {

// modif 2

	List<Stock> retrieveAllStocks();

	Stock addStock(Stock s);

	void deleteStock(Long id);

	Stock updateStock(Stock u);

	Stock retrieveStock(Long id);

	String retrieveStatusStock();
}
