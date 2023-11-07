from matplotlib import pyplot as plt

def bubble_sort(lista):
    alterado = False
    for i in range(len(lista)-1, 0, -1):
        for j in range(i):
            if lista[j] > lista[j+1]:
                lista[j], lista[j+1] = lista[j+1], lista[j]
                alterado = True
                plt.bar(range(1, len(lista)+1), lista)
                plt.show()
        if alterado:
            alterado = False
        else:
            return


array = [5, 1, 3, 2, 4]

bubble_sort(array)
print(array)
