# PART A - TARGET PATH IDENTIFICATION

Nodes N = 10, edges E = 12, V(G) = E - N + 2 = 4
Decision nodes: {2, 5, 7} -> 2^n bound = 8, feasible paths = 4

TABLE III-like: Target path calculation
1-2-3-10          nodes=4 | 1.350 + 5.300 + 8.582 = 15.232
1-2-4-5-6-10       nodes=6 | 1.350 + 1.350 + 1.350 + 5.300 + 6.670 = 16.020
1-2-4-5-7-8-10     nodes=7 | 1.350 + 1.350 + 1.350 + 1.350 + 5.300 + 5.940 = 16.640  <- TARGET
1-2-4-5-7-9-10     nodes=7 | 1.350 + 1.350 + 1.350 + 1.350 + 1.350 + 8.100

TABLE IV-like: Chromosomes (path + remaining nodes, length 10)
1-2-3-10       -> 1-2-3-10-4-5-6-7-8-9
1-2-4-5-6-10    -> 1-2-4-5-6-10-3-7-8-9
1-2-4-5-7-8-10  -> 1-2-4-5-7-8-10-3-6-9
1-2-4-5-7-9-10  -> 1-2-4-5-7-9-10-3-6-8
Target chromosome: 1-2-4-5-7-8-10-3-6-9

Initial population (first 5 of 100) with fitness:
1-3-8-9-6-2-10-5-4-7      fitness=2
1-5-4-10-8-9-3-6-2-7      fitness=2
1-10-7-4-8-9-6-2-5-3      fitness=1
1-3-4-7-9-10-8-6-2-5      fitness=2
1-7-6-8-2-3-5-9-4-10     fitness=1

TABLE V-like: After tournament selection
Parent 1: 1-3-9-2-8-4-5-7-6-10    fitness=2
Parent 2: 1-7-6-8-2-3-5-9-4-10    fitness=1
Parent 3: 1-2-4-9-5-3-6-7-10-8    fitness=3
Parent 4: 1-7-2-5-10-3-4-6-8-9    fitness=3
Parent 5: 1-3-7-6-9-5-10-2-4-8    fitness=2