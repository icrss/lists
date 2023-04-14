package org.theradfords.holly.lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayListTest {

    @Test
    void givenANewList_whenEvaluatingSize_isZero() {
        List list = new ArrayList();
        assertThat(list.size()).isEqualTo(0);
    }

    @Test
    void givenANewList_whenAddEntry_sizeIsOne() {
        List list = new ArrayList();
        list.append("holly");
        assertThat(list.size()).isEqualTo(1);
        assertThat(list.size()).isEqualTo(1);
    }

    @Test
    void givenANewList_whenAddTwoEntry_sizeIsTwo() {
        List list = new ArrayList();
        list.append("holly");
        list.append("will");
        assertThat(list.size()).isEqualTo(2);
        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    void givenAList_whenAddEntryAndGet_sameValueReturned() {
        List list = new ArrayList();
        list.append("holly");
        assertThat(list.get(0)).isEqualTo("holly");
    }

    @Test
    void givenAList_whenAddDifferentEntryAndGet_sameValueReturned() {
        List list = new ArrayList();
        list.append("will");
        assertThat(list.get(0)).isEqualTo("will");
    }

    @Test
    void givenAnEmptyList_whendGet_nullReturned() {
        List list = new ArrayList();
        assertThat(list.get(0)).isNull();
    }

    @Test
    void givenAnList_whendGetTooHigh_nullReturned() {
        List list = new ArrayList();
        list.append("will");
        list.append("will");
        assertThat(list.get(2)).isNull();
    }

    @Test
    void givenAList_whenTwoEntriesEntryAndGetOne_SecondValueReturned() {
        List list = new ArrayList();
        list.append("holly");
        list.append("will");
        assertThat(list.get(1)).isEqualTo("will");
    }

    @Test
    void givenAList_whenTwoEntriesEntryAndGetBoth_CorrectValuesReturned() {
        List list = new ArrayList();
        list.append("holly");
        list.append("will");
        assertThat(list.get(0)).isEqualTo("holly");
        assertThat(list.get(1)).isEqualTo("will");
    }

    @Test
    void givenANewList_whenAddTwoSameEntry_sizeIsTwo() {
        List list = new ArrayList();
        list.append("holly");
        list.append("holly");
        assertThat(list.size()).isEqualTo(2);
        assertThat(list.size()).isEqualTo(2);
    }
}