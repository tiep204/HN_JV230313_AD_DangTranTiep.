package ra.service;

import ra.model.Catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogService implements IService<Catalog, Integer> {
    static List<Catalog> catalogList = new ArrayList<>();

    @Override
    public void getAll() {
        for (Catalog c : catalogList) {
            c.displayData();
        }
    }
    public void update(Catalog catalog){
        System.out.println("Mời bạn nhập id danh muc: ");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        catalog = findById(id);
        if (catalog == null){
            System.out.println("Không tìm thấy danh mục: ");
            return;
        }

    }

    @Override
    public void save(Catalog catalog) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng bạn muốn thêm danh muc: ");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("Mời bạn nhập thông tin danh mục thứ: " + (i + 1));
            catalog.setCatalogId(i + 1);
            new Catalog();
            System.out.println("Mời bạn nhập tên danh mục ");
            catalog.setCatalogName(sc.nextLine());
            catalogList.add(catalog);
        }
        System.out.println("Bạn đã thêm mới thành công " + num + " danh mục");
    }

    @Override
    public Catalog findById(Integer integer) {
        for (Catalog cat : catalogList) {
            if (cat.getCatalogId() == integer) {
                return cat;
            }
        }
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}