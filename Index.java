import sys

# Number of vertices
V = 5

def prim_mst(graph):
    selected = [False] * V
    selected[0] = True
    no_of_edges = 0

    print("Edge : Weight\n")
    while no_of_edges < V - 1:
        minimum = sys.maxsize
        x = 0
        y = 0

        for i in range(V):
            if selected[i]:
                for j in range(V):
                    if not selected[j] and graph[i][j]:
                        if minimum > graph[i][j]:
                            minimum = graph[i][j]
                            x = i
                            y = j

        print(f"{x} - {y} : {graph[x][y]}")
        selected[y] = True
        no_of_edges += 1

# Example graph (adjacency matrix)
graph = [
    [0, 2, 0, 6, 0],
    [2, 0, 3, 8, 5],
    [0, 3, 0, 0, 7],
    [6, 8, 0, 0, 9],
    [0, 5, 7, 9, 0]
]

prim_mst(graph)
