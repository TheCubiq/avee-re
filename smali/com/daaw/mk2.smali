.class public final Lcom/daaw/mk2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zj2;


# instance fields
.field public final synthetic a:Lcom/daaw/dl2;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dl2;Lcom/daaw/hk2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mk2;->a:Lcom/daaw/dl2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B[B)V
    .locals 126

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/mk2;->a:Lcom/daaw/dl2;

    iget v2, v1, Lcom/daaw/dl2;->X:I

    iget v3, v1, Lcom/daaw/dl2;->H:I

    and-int v4, v2, v3

    xor-int/lit8 v5, v2, -0x1

    and-int v6, v3, v5

    xor-int/lit8 v7, v6, -0x1

    and-int/2addr v7, v3

    or-int v8, v2, v3

    iget v9, v1, Lcom/daaw/dl2;->X0:I

    iget v10, v1, Lcom/daaw/dl2;->o:I

    xor-int/2addr v9, v10

    iget v11, v1, Lcom/daaw/dl2;->P0:I

    iget v12, v1, Lcom/daaw/dl2;->x0:I

    iget v13, v1, Lcom/daaw/dl2;->g:I

    xor-int/lit8 v14, v13, -0x1

    iget v15, v1, Lcom/daaw/dl2;->n0:I

    xor-int/2addr v11, v9

    xor-int/2addr v11, v12

    and-int/2addr v11, v14

    xor-int/2addr v11, v15

    iget v12, v1, Lcom/daaw/dl2;->Z:I

    xor-int/2addr v11, v12

    iput v11, v1, Lcom/daaw/dl2;->Z:I

    iget v12, v1, Lcom/daaw/dl2;->J0:I

    xor-int/2addr v9, v12

    iget v12, v1, Lcom/daaw/dl2;->F1:I

    xor-int/2addr v9, v12

    iget v12, v1, Lcom/daaw/dl2;->w0:I

    xor-int/2addr v9, v12

    iget v12, v1, Lcom/daaw/dl2;->D:I

    xor-int/2addr v9, v12

    iput v9, v1, Lcom/daaw/dl2;->D:I

    iget v12, v1, Lcom/daaw/dl2;->b0:I

    xor-int/lit8 v15, v12, -0x1

    and-int v16, v9, v15

    iget v0, v1, Lcom/daaw/dl2;->n:I

    move/from16 p1, v10

    iget v10, v1, Lcom/daaw/dl2;->A0:I

    move/from16 p2, v5

    iget v5, v1, Lcom/daaw/dl2;->O0:I

    move/from16 v17, v12

    iget v12, v1, Lcom/daaw/dl2;->I1:I

    move/from16 v18, v15

    iget v15, v1, Lcom/daaw/dl2;->D0:I

    move/from16 v19, v7

    iget v7, v1, Lcom/daaw/dl2;->L:I

    move/from16 v20, v6

    iget v6, v1, Lcom/daaw/dl2;->y1:I

    move/from16 v21, v4

    iget v4, v1, Lcom/daaw/dl2;->D1:I

    xor-int/lit8 v6, v6, -0x1

    and-int/2addr v6, v0

    xor-int/2addr v4, v6

    iget v6, v1, Lcom/daaw/dl2;->z0:I

    move/from16 v22, v4

    iget v4, v1, Lcom/daaw/dl2;->z1:I

    move/from16 v23, v3

    iget v3, v1, Lcom/daaw/dl2;->F0:I

    and-int/2addr v4, v0

    xor-int/2addr v3, v4

    and-int v4, v0, v15

    xor-int/2addr v4, v6

    and-int/2addr v4, v7

    xor-int/2addr v3, v4

    iget v4, v1, Lcom/daaw/dl2;->h0:I

    or-int v6, v4, v3

    and-int/2addr v3, v4

    move/from16 v24, v6

    iget v6, v1, Lcom/daaw/dl2;->K1:I

    move/from16 v25, v3

    iget v3, v1, Lcom/daaw/dl2;->J1:I

    xor-int/lit8 v6, v6, -0x1

    and-int/2addr v6, v0

    xor-int/2addr v3, v6

    xor-int/lit8 v6, v0, -0x1

    and-int/2addr v6, v12

    xor-int/2addr v6, v15

    and-int/2addr v6, v7

    xor-int/2addr v3, v6

    iget v6, v1, Lcom/daaw/dl2;->G1:I

    xor-int/lit8 v10, v10, -0x1

    and-int/2addr v10, v0

    xor-int/2addr v5, v10

    iget v10, v1, Lcom/daaw/dl2;->x1:I

    xor-int/lit8 v15, v6, -0x1

    and-int/2addr v15, v0

    xor-int/2addr v10, v15

    xor-int/lit8 v10, v10, -0x1

    and-int/2addr v10, v7

    xor-int/2addr v5, v10

    xor-int/lit8 v10, v4, -0x1

    and-int/2addr v10, v5

    xor-int/2addr v10, v3

    iget v15, v1, Lcom/daaw/dl2;->a0:I

    xor-int/2addr v10, v15

    iput v10, v1, Lcom/daaw/dl2;->a0:I

    xor-int v15, v10, v13

    move/from16 v26, v7

    iget v7, v1, Lcom/daaw/dl2;->K0:I

    xor-int/2addr v7, v15

    or-int v15, v10, v13

    move/from16 v27, v6

    iget v6, v1, Lcom/daaw/dl2;->S:I

    move/from16 v28, v12

    iget v12, v1, Lcom/daaw/dl2;->C:I

    move/from16 v29, v8

    iget v8, v1, Lcom/daaw/dl2;->s0:I

    xor-int/lit8 v30, v15, -0x1

    and-int v30, v6, v30

    xor-int/lit8 v30, v30, -0x1

    and-int v30, v12, v30

    xor-int v30, v8, v30

    xor-int v31, v10, v6

    xor-int/lit8 v32, v10, -0x1

    and-int v32, v13, v32

    xor-int/lit8 v33, v12, -0x1

    and-int v34, v32, v33

    move/from16 v35, v2

    iget v2, v1, Lcom/daaw/dl2;->i0:I

    move/from16 v36, v0

    iget v0, v1, Lcom/daaw/dl2;->u0:I

    and-int v37, v6, v32

    move/from16 v38, v3

    iget v3, v1, Lcom/daaw/dl2;->p1:I

    and-int v39, v10, v13

    and-int v40, v6, v39

    move/from16 v41, v4

    iget v4, v1, Lcom/daaw/dl2;->E1:I

    move/from16 v42, v5

    iget v5, v1, Lcom/daaw/dl2;->e1:I

    xor-int/2addr v5, v10

    and-int v43, v5, v33

    and-int/2addr v14, v10

    or-int v44, v13, v14

    move/from16 v45, v13

    iget v13, v1, Lcom/daaw/dl2;->B0:I

    move/from16 v46, v13

    iget v13, v1, Lcom/daaw/dl2;->K:I

    xor-int/lit8 v47, v32, -0x1

    and-int v47, v6, v47

    xor-int v3, v47, v3

    xor-int/lit8 v3, v3, -0x1

    and-int/2addr v3, v2

    xor-int v3, v30, v3

    and-int v30, v6, v44

    and-int v30, v12, v30

    xor-int v30, v31, v30

    and-int v34, v2, v34

    xor-int v30, v30, v34

    and-int v30, v13, v30

    xor-int v3, v3, v30

    move/from16 v30, v0

    iget v0, v1, Lcom/daaw/dl2;->f:I

    xor-int/2addr v0, v3

    iput v0, v1, Lcom/daaw/dl2;->f:I

    xor-int/lit8 v3, v0, -0x1

    and-int v34, v11, v3

    or-int v47, v0, v11

    and-int v48, v47, v3

    xor-int v49, v11, v0

    and-int v50, v11, v0

    xor-int/lit8 v50, v50, -0x1

    and-int v51, v0, v50

    move/from16 v52, v11

    and-int v11, v9, v3

    or-int v53, v0, v9

    iput v11, v1, Lcom/daaw/dl2;->n0:I

    and-int v54, v44, v33

    xor-int v31, v31, v54

    xor-int v10, v10, v40

    or-int/2addr v10, v12

    xor-int/2addr v4, v10

    xor-int/lit8 v4, v4, -0x1

    and-int/2addr v4, v2

    xor-int v4, v31, v4

    xor-int/lit8 v10, v14, -0x1

    and-int/2addr v10, v6

    xor-int v31, v39, v37

    and-int v31, v31, v33

    xor-int v10, v10, v31

    move/from16 v31, v3

    iget v3, v1, Lcom/daaw/dl2;->Q0:I

    xor-int/2addr v3, v10

    xor-int/lit8 v3, v3, -0x1

    and-int/2addr v3, v13

    xor-int/2addr v3, v4

    iget v4, v1, Lcom/daaw/dl2;->r:I

    xor-int/2addr v3, v4

    iput v3, v1, Lcom/daaw/dl2;->r:I

    xor-int v4, v15, v40

    or-int/2addr v4, v12

    xor-int/2addr v4, v8

    xor-int v8, v44, v37

    xor-int v8, v8, v43

    and-int/2addr v8, v2

    xor-int/2addr v4, v8

    xor-int v8, v14, v37

    and-int/2addr v8, v12

    xor-int/2addr v5, v8

    and-int v8, v2, v43

    xor-int/2addr v5, v8

    xor-int/lit8 v5, v5, -0x1

    and-int/2addr v5, v13

    xor-int/2addr v4, v5

    iget v5, v1, Lcom/daaw/dl2;->d:I

    xor-int/2addr v4, v5

    iput v4, v1, Lcom/daaw/dl2;->d:I

    iget v5, v1, Lcom/daaw/dl2;->J:I

    xor-int/lit8 v8, v5, -0x1

    and-int v10, v4, v8

    and-int v15, v4, v5

    and-int v33, v6, v14

    xor-int v14, v14, v33

    and-int/2addr v14, v12

    xor-int/lit8 v14, v14, -0x1

    and-int/2addr v14, v2

    xor-int/2addr v7, v14

    xor-int v14, v32, v30

    xor-int v30, v44, v46

    xor-int/lit8 v30, v30, -0x1

    and-int v2, v2, v30

    xor-int/2addr v2, v14

    xor-int/lit8 v2, v2, -0x1

    and-int/2addr v2, v13

    xor-int/2addr v2, v7

    iget v7, v1, Lcom/daaw/dl2;->x:I

    xor-int/2addr v2, v7

    iput v2, v1, Lcom/daaw/dl2;->x:I

    xor-int/lit8 v7, v42, -0x1

    and-int v7, v41, v7

    xor-int v7, v38, v7

    iget v14, v1, Lcom/daaw/dl2;->k0:I

    xor-int/2addr v7, v14

    iput v7, v1, Lcom/daaw/dl2;->k0:I

    iget v14, v1, Lcom/daaw/dl2;->M:I

    and-int v30, v14, v7

    move/from16 v32, v12

    iget v12, v1, Lcom/daaw/dl2;->c0:I

    xor-int/lit8 v33, v7, -0x1

    and-int v37, v12, v33

    move/from16 v38, v6

    iget v6, v1, Lcom/daaw/dl2;->E:I

    xor-int/lit8 v39, v6, -0x1

    move/from16 v40, v15

    iget v15, v1, Lcom/daaw/dl2;->H1:I

    move/from16 v42, v10

    iget v10, v1, Lcom/daaw/dl2;->C0:I

    move/from16 v43, v13

    iget v13, v1, Lcom/daaw/dl2;->s1:I

    xor-int v44, v12, v7

    move/from16 v46, v4

    iget v4, v1, Lcom/daaw/dl2;->b1:I

    xor-int v4, v44, v4

    and-int v54, v14, v44

    move/from16 v55, v8

    iget v8, v1, Lcom/daaw/dl2;->U0:I

    move/from16 v56, v2

    iget v2, v1, Lcom/daaw/dl2;->a:I

    xor-int v57, v37, v54

    and-int v57, v57, v6

    xor-int v8, v8, v57

    xor-int/lit8 v8, v8, -0x1

    and-int/2addr v8, v2

    xor-int/lit8 v44, v44, -0x1

    and-int v44, v14, v44

    xor-int v44, v12, v44

    and-int v57, v14, v33

    xor-int v57, v7, v57

    move/from16 v58, v11

    iget v11, v1, Lcom/daaw/dl2;->G0:I

    move/from16 v59, v0

    iget v0, v1, Lcom/daaw/dl2;->H0:I

    xor-int/lit8 v11, v11, -0x1

    and-int/2addr v11, v7

    xor-int/2addr v0, v11

    iget v11, v1, Lcom/daaw/dl2;->R0:I

    move/from16 v60, v9

    iget v9, v1, Lcom/daaw/dl2;->L0:I

    and-int/2addr v13, v7

    xor-int/2addr v13, v10

    xor-int/lit8 v11, v11, -0x1

    and-int/2addr v11, v7

    xor-int/2addr v11, v9

    and-int/2addr v11, v2

    xor-int/2addr v11, v13

    iget v13, v1, Lcom/daaw/dl2;->F:I

    xor-int/2addr v11, v13

    iput v11, v1, Lcom/daaw/dl2;->F:I

    and-int v13, v15, v33

    xor-int/2addr v10, v13

    iget v13, v1, Lcom/daaw/dl2;->g1:I

    and-int v13, v13, v33

    xor-int/2addr v9, v13

    and-int/2addr v9, v2

    xor-int/2addr v9, v10

    iget v10, v1, Lcom/daaw/dl2;->B:I

    xor-int/2addr v9, v10

    iput v9, v1, Lcom/daaw/dl2;->B:I

    or-int v10, v9, v51

    or-int v13, v9, v5

    or-int v15, v7, v12

    move/from16 v61, v11

    iget v11, v1, Lcom/daaw/dl2;->Z0:I

    xor-int/2addr v11, v15

    move/from16 v62, v10

    iget v10, v1, Lcom/daaw/dl2;->I0:I

    xor-int/2addr v10, v11

    and-int v63, v14, v37

    and-int v63, v63, v39

    xor-int v11, v11, v63

    and-int/2addr v11, v2

    and-int v63, v14, v15

    xor-int v63, v37, v63

    and-int v64, v63, v6

    move/from16 v65, v13

    iget v13, v1, Lcom/daaw/dl2;->U:I

    xor-int/lit8 v66, v13, -0x1

    and-int v67, v15, v33

    xor-int/lit8 v68, v67, -0x1

    and-int v68, v14, v68

    xor-int/lit8 v69, v68, -0x1

    and-int v69, v6, v69

    xor-int v37, v37, v68

    and-int v37, v37, v39

    xor-int v37, v63, v37

    xor-int/lit8 v37, v37, -0x1

    and-int v37, v2, v37

    xor-int/lit8 v63, v12, -0x1

    and-int v63, v7, v63

    and-int v63, v14, v63

    move/from16 v68, v5

    iget v5, v1, Lcom/daaw/dl2;->t0:I

    xor-int v5, v67, v5

    or-int/2addr v5, v6

    xor-int/2addr v5, v4

    xor-int v67, v67, v63

    xor-int/lit8 v67, v67, -0x1

    and-int v67, v6, v67

    xor-int v67, v44, v67

    and-int v67, v2, v67

    xor-int v5, v5, v67

    xor-int/lit8 v4, v4, -0x1

    and-int/2addr v4, v6

    xor-int v4, v44, v4

    xor-int v67, v15, v54

    xor-int/lit8 v67, v67, -0x1

    and-int v67, v6, v67

    xor-int v44, v44, v67

    xor-int/lit8 v44, v44, -0x1

    and-int v44, v2, v44

    xor-int v4, v4, v44

    and-int v4, v4, v66

    xor-int/2addr v4, v5

    xor-int v4, v4, v41

    iput v4, v1, Lcom/daaw/dl2;->h0:I

    iget v5, v1, Lcom/daaw/dl2;->A1:I

    move/from16 v41, v4

    iget v4, v1, Lcom/daaw/dl2;->f1:I

    xor-int/lit8 v5, v5, -0x1

    and-int/2addr v5, v7

    xor-int/2addr v4, v5

    xor-int/lit8 v4, v4, -0x1

    and-int/2addr v4, v2

    xor-int/2addr v0, v4

    xor-int v0, v0, v36

    iput v0, v1, Lcom/daaw/dl2;->A1:I

    iget v0, v1, Lcom/daaw/dl2;->r0:I

    iget v4, v1, Lcom/daaw/dl2;->o0:I

    iget v5, v1, Lcom/daaw/dl2;->m1:I

    move/from16 v44, v9

    iget v9, v1, Lcom/daaw/dl2;->k1:I

    xor-int/lit8 v5, v5, -0x1

    and-int/2addr v5, v7

    xor-int/2addr v5, v9

    and-int/2addr v0, v7

    xor-int/2addr v0, v4

    xor-int/lit8 v0, v0, -0x1

    and-int/2addr v0, v2

    xor-int/2addr v0, v5

    iget v4, v1, Lcom/daaw/dl2;->P:I

    xor-int/2addr v0, v4

    iput v0, v1, Lcom/daaw/dl2;->P:I

    iget v4, v1, Lcom/daaw/dl2;->y0:I

    or-int v5, v0, v4

    xor-int v5, v35, v5

    iget v9, v1, Lcom/daaw/dl2;->C1:I

    or-int v29, v0, v29

    xor-int v29, v9, v29

    xor-int/lit8 v67, v0, -0x1

    and-int v70, v23, v67

    xor-int v71, v21, v70

    or-int v72, v0, v20

    xor-int v72, v9, v72

    and-int v73, v9, v67

    xor-int v19, v19, v73

    or-int v73, v0, v35

    xor-int v73, v35, v73

    and-int v4, v4, v67

    xor-int v74, v9, v0

    and-int v75, v35, v67

    xor-int v21, v21, v75

    and-int v67, v20, v67

    or-int v76, v0, v9

    xor-int v77, v35, v75

    xor-int/2addr v9, v4

    xor-int v35, v35, v70

    or-int v0, v0, v23

    and-int v78, v12, v7

    xor-int/lit8 v79, v78, -0x1

    and-int v7, v7, v79

    move/from16 v79, v12

    iget v12, v1, Lcom/daaw/dl2;->w1:I

    xor-int v80, v78, v14

    xor-int v81, v80, v6

    xor-int v11, v81, v11

    and-int v81, v78, v6

    xor-int v54, v54, v81

    and-int v54, v2, v54

    xor-int v10, v10, v54

    or-int/2addr v10, v13

    xor-int/2addr v10, v11

    iget v11, v1, Lcom/daaw/dl2;->j0:I

    xor-int/2addr v10, v11

    iput v10, v1, Lcom/daaw/dl2;->j0:I

    and-int v11, v14, v78

    xor-int/2addr v11, v15

    and-int v15, v78, v39

    xor-int/2addr v15, v11

    xor-int v15, v15, v37

    xor-int v37, v78, v30

    or-int v37, v6, v37

    xor-int v37, v80, v37

    xor-int v8, v37, v8

    or-int/2addr v8, v13

    xor-int/2addr v8, v15

    iget v15, v1, Lcom/daaw/dl2;->l:I

    xor-int/2addr v8, v15

    iput v8, v1, Lcom/daaw/dl2;->l:I

    xor-int v11, v11, v64

    xor-int v15, v7, v63

    xor-int v15, v15, v69

    xor-int/lit8 v15, v15, -0x1

    and-int/2addr v15, v2

    xor-int/2addr v11, v15

    and-int v15, v6, v33

    xor-int v15, v57, v15

    xor-int/2addr v7, v12

    xor-int/lit8 v7, v7, -0x1

    and-int/2addr v6, v7

    xor-int v6, v30, v6

    and-int/2addr v6, v2

    xor-int/2addr v6, v15

    and-int v6, v6, v66

    xor-int/2addr v6, v11

    iget v7, v1, Lcom/daaw/dl2;->j:I

    xor-int/2addr v6, v7

    iput v6, v1, Lcom/daaw/dl2;->j:I

    or-int v7, v3, v6

    xor-int/lit8 v11, v3, -0x1

    and-int v12, v6, v11

    and-int v15, v36, v28

    xor-int v15, v27, v15

    xor-int/lit8 v15, v15, -0x1

    and-int v15, v26, v15

    xor-int v15, v22, v15

    xor-int v22, v15, v25

    move/from16 v25, v12

    iget v12, v1, Lcom/daaw/dl2;->I:I

    xor-int v12, v22, v12

    iput v12, v1, Lcom/daaw/dl2;->I:I

    move/from16 v22, v11

    iget v11, v1, Lcom/daaw/dl2;->k:I

    xor-int v26, v12, v11

    move/from16 v27, v3

    iget v3, v1, Lcom/daaw/dl2;->e0:I

    and-int v28, v3, v26

    move/from16 v30, v6

    iget v6, v1, Lcom/daaw/dl2;->c:I

    or-int v33, v26, v6

    xor-int/lit8 v36, v6, -0x1

    xor-int/lit8 v37, v26, -0x1

    and-int v37, v3, v37

    xor-int v37, v26, v37

    and-int v37, v37, v36

    move/from16 v39, v14

    iget v14, v1, Lcom/daaw/dl2;->A:I

    xor-int v54, v11, v28

    and-int v54, v54, v14

    xor-int v26, v26, v3

    xor-int/lit8 v57, v12, -0x1

    and-int v63, v11, v57

    and-int v64, v3, v63

    xor-int/lit8 v66, v11, -0x1

    and-int v69, v12, v66

    and-int v69, v3, v69

    and-int v78, v6, v69

    xor-int v78, v69, v78

    xor-int/lit8 v78, v78, -0x1

    and-int v78, v14, v78

    and-int v57, v3, v57

    or-int v80, v12, v11

    xor-int/lit8 v81, v80, -0x1

    and-int v81, v3, v81

    or-int v82, v6, v81

    xor-int v82, v26, v82

    and-int v83, v64, v36

    xor-int v83, v69, v83

    and-int v83, v83, v14

    xor-int v82, v82, v83

    and-int v66, v80, v66

    and-int v83, v3, v80

    xor-int v64, v11, v64

    or-int v64, v6, v64

    xor-int v64, v83, v64

    xor-int v83, v66, v69

    xor-int v28, v63, v28

    and-int v28, v28, v36

    xor-int v28, v83, v28

    xor-int/lit8 v28, v28, -0x1

    and-int v28, v14, v28

    xor-int v28, v64, v28

    move/from16 v63, v15

    iget v15, v1, Lcom/daaw/dl2;->O1:I

    move/from16 v64, v13

    iget v13, v1, Lcom/daaw/dl2;->M1:I

    and-int/2addr v15, v12

    xor-int/2addr v13, v15

    iget v15, v1, Lcom/daaw/dl2;->v:I

    xor-int/2addr v13, v15

    iput v13, v1, Lcom/daaw/dl2;->v:I

    xor-int/lit8 v15, v60, -0x1

    and-int/2addr v15, v13

    move/from16 v83, v3

    xor-int v3, v15, v59

    iput v3, v1, Lcom/daaw/dl2;->O1:I

    and-int v3, v60, v13

    xor-int/lit8 v84, v3, -0x1

    and-int v84, v13, v84

    move/from16 v85, v11

    xor-int v11, v84, v58

    iput v11, v1, Lcom/daaw/dl2;->D1:I

    xor-int v11, v3, v59

    iput v11, v1, Lcom/daaw/dl2;->B0:I

    and-int v11, v3, v31

    xor-int/2addr v3, v11

    iput v3, v1, Lcom/daaw/dl2;->K1:I

    or-int v3, v59, v13

    xor-int v11, v60, v3

    iput v11, v1, Lcom/daaw/dl2;->Q0:I

    xor-int/lit8 v11, v13, -0x1

    and-int v11, v60, v11

    and-int v15, v15, v31

    xor-int/2addr v11, v15

    iput v11, v1, Lcom/daaw/dl2;->M1:I

    and-int v11, v13, v31

    xor-int/2addr v11, v13

    iput v11, v1, Lcom/daaw/dl2;->o1:I

    xor-int v11, v60, v13

    or-int v15, v13, v60

    move/from16 v58, v2

    xor-int v2, v15, v53

    iput v2, v1, Lcom/daaw/dl2;->x0:I

    and-int v2, v15, v31

    xor-int/2addr v2, v13

    iput v2, v1, Lcom/daaw/dl2;->n1:I

    and-int v2, v11, v31

    xor-int/2addr v2, v15

    iput v2, v1, Lcom/daaw/dl2;->l1:I

    iput v3, v1, Lcom/daaw/dl2;->j1:I

    xor-int v2, v11, v3

    iput v2, v1, Lcom/daaw/dl2;->B1:I

    xor-int v2, v12, v57

    and-int v3, v6, v2

    xor-int/2addr v3, v2

    xor-int v11, v66, v57

    xor-int/lit8 v11, v11, -0x1

    and-int/2addr v11, v6

    xor-int/2addr v11, v2

    or-int/2addr v2, v6

    xor-int v2, v81, v2

    xor-int/lit8 v2, v2, -0x1

    and-int/2addr v2, v14

    xor-int/2addr v2, v11

    iget v11, v1, Lcom/daaw/dl2;->s:I

    and-int/2addr v2, v11

    xor-int v2, v28, v2

    iget v13, v1, Lcom/daaw/dl2;->z:I

    xor-int/2addr v2, v13

    iput v2, v1, Lcom/daaw/dl2;->z:I

    or-int v13, v2, v7

    iget v15, v1, Lcom/daaw/dl2;->p0:I

    move/from16 v28, v13

    iget v13, v1, Lcom/daaw/dl2;->v1:I

    xor-int/lit8 v15, v15, -0x1

    and-int/2addr v15, v12

    xor-int/2addr v13, v15

    iget v15, v1, Lcom/daaw/dl2;->h:I

    xor-int/2addr v13, v15

    iput v13, v1, Lcom/daaw/dl2;->h:I

    and-int v15, v60, v13

    and-int v53, v15, v18

    move/from16 v81, v7

    xor-int v7, v15, v53

    iput v7, v1, Lcom/daaw/dl2;->v1:I

    and-int v7, v10, v13

    or-int v53, v17, v13

    xor-int/lit8 v84, v13, -0x1

    and-int v86, v60, v84

    move/from16 v87, v7

    xor-int v7, v86, v53

    iput v7, v1, Lcom/daaw/dl2;->d1:I

    and-int v7, v13, v18

    xor-int/lit8 v86, v57, -0x1

    and-int v86, v6, v86

    xor-int v86, v12, v86

    and-int v86, v14, v86

    xor-int v3, v3, v86

    xor-int/lit8 v3, v3, -0x1

    and-int/2addr v3, v11

    and-int v57, v57, v36

    xor-int v57, v69, v57

    xor-int/lit8 v57, v57, -0x1

    and-int v57, v14, v57

    xor-int v37, v37, v57

    and-int v37, v11, v37

    xor-int v37, v82, v37

    move/from16 v57, v15

    iget v15, v1, Lcom/daaw/dl2;->N:I

    xor-int v15, v37, v15

    iput v15, v1, Lcom/daaw/dl2;->N:I

    move/from16 v37, v7

    iget v7, v1, Lcom/daaw/dl2;->d0:I

    move/from16 v82, v3

    xor-int v3, v7, v15

    iput v3, v1, Lcom/daaw/dl2;->L1:I

    move/from16 v86, v14

    iget v14, v1, Lcom/daaw/dl2;->l0:I

    xor-int/lit8 v88, v14, -0x1

    and-int v3, v3, v88

    and-int v89, v10, v15

    xor-int v90, v13, v15

    xor-int v91, v90, v10

    xor-int/lit8 v92, v90, -0x1

    and-int v92, v10, v92

    xor-int v92, v13, v92

    or-int v93, v15, v7

    or-int v94, v14, v15

    and-int v95, v15, v84

    xor-int v96, v95, v89

    and-int v97, v10, v95

    xor-int v97, v15, v97

    xor-int/lit8 v98, v95, -0x1

    and-int v99, v10, v98

    xor-int v99, v13, v99

    and-int v99, v56, v99

    and-int v100, v13, v15

    and-int v100, v10, v100

    xor-int/lit8 v101, v15, -0x1

    and-int v102, v13, v101

    xor-int/lit8 v103, v102, -0x1

    and-int v104, v10, v103

    xor-int v105, v90, v104

    or-int v106, v15, v102

    and-int v106, v10, v106

    xor-int v107, v95, v106

    and-int v107, v56, v107

    and-int v108, v10, v102

    xor-int/lit8 v109, v108, -0x1

    and-int v109, v56, v109

    xor-int v110, v102, v108

    xor-int/lit8 v110, v110, -0x1

    and-int v110, v56, v110

    xor-int v102, v102, v104

    xor-int v90, v90, v108

    and-int v98, v15, v98

    xor-int v98, v98, v108

    xor-int v89, v15, v89

    and-int v89, v56, v89

    or-int v108, v13, v15

    xor-int v104, v108, v104

    xor-int/lit8 v108, v108, -0x1

    and-int v108, v10, v108

    xor-int v108, v15, v108

    move/from16 v111, v3

    iget v3, v1, Lcom/daaw/dl2;->v0:I

    move/from16 v112, v14

    iget v14, v1, Lcom/daaw/dl2;->S0:I

    and-int/2addr v3, v12

    xor-int/2addr v3, v14

    iget v14, v1, Lcom/daaw/dl2;->f0:I

    xor-int/2addr v3, v14

    iput v3, v1, Lcom/daaw/dl2;->f0:I

    or-int v14, v3, v76

    xor-int/2addr v14, v9

    and-int v76, v3, v55

    xor-int/lit8 v113, v44, -0x1

    and-int v114, v76, v113

    xor-int v114, v76, v114

    or-int v115, v114, v46

    or-int v76, v44, v76

    xor-int v76, v3, v76

    xor-int/lit8 v76, v76, -0x1

    and-int v76, v46, v76

    xor-int/lit8 v73, v73, -0x1

    and-int v73, v3, v73

    xor-int v73, v9, v73

    and-int v116, v3, p2

    xor-int v116, v72, v116

    xor-int v116, v116, v46

    xor-int/lit8 v117, v3, -0x1

    and-int v118, v0, v117

    xor-int v118, v74, v118

    and-int v71, v71, v3

    xor-int v20, v20, v71

    or-int v20, v46, v20

    xor-int v20, v118, v20

    xor-int/lit8 v71, v46, -0x1

    and-int v74, v3, v74

    xor-int v67, v67, v74

    and-int v67, v67, v71

    or-int v74, v3, v46

    xor-int v74, v114, v74

    xor-int/lit8 v75, v75, -0x1

    and-int v75, v3, v75

    xor-int v5, v5, v75

    and-int v5, v46, v5

    xor-int v5, v73, v5

    and-int/2addr v0, v3

    xor-int/2addr v0, v4

    and-int v35, v35, v3

    or-int v35, v46, v35

    xor-int v0, v0, v35

    or-int/2addr v0, v2

    xor-int/2addr v0, v5

    xor-int v0, v0, v43

    iput v0, v1, Lcom/daaw/dl2;->K:I

    and-int v5, v68, v3

    and-int v35, v5, v113

    and-int v43, v35, v71

    xor-int v43, v114, v43

    xor-int v75, v3, v68

    xor-int v114, v75, v44

    xor-int v76, v114, v76

    and-int v77, v77, v3

    xor-int/lit8 v114, v2, -0x1

    and-int v118, v68, v117

    xor-int/lit8 v119, v118, -0x1

    and-int v119, v68, v119

    xor-int v120, v119, v35

    xor-int v121, v120, v42

    or-int v122, v44, v119

    xor-int v123, v75, v122

    xor-int v124, v75, v35

    and-int v124, v46, v124

    xor-int v123, v123, v124

    xor-int v65, v119, v65

    xor-int v119, v68, v122

    xor-int/lit8 v119, v119, -0x1

    and-int v119, v46, v119

    xor-int v65, v65, v119

    xor-int v5, v5, v122

    xor-int v40, v5, v40

    and-int v119, v118, v113

    xor-int v119, v68, v119

    or-int v122, v46, v119

    xor-int v122, v68, v122

    xor-int v124, v118, v44

    xor-int v42, v124, v42

    or-int v124, v44, v118

    xor-int v124, v75, v124

    and-int v125, v46, v124

    or-int v125, v8, v125

    and-int v119, v46, v119

    xor-int v119, v124, v119

    or-int v19, v3, v19

    xor-int v19, v72, v19

    and-int v19, v19, v71

    xor-int v19, v73, v19

    xor-int v4, v4, v77

    xor-int v29, v29, v77

    or-int v29, v29, v46

    xor-int v4, v4, v29

    and-int v4, v4, v114

    xor-int v4, v19, v4

    xor-int v4, v4, v58

    iput v4, v1, Lcom/daaw/dl2;->a:I

    or-int v19, v3, v68

    xor-int v29, v19, v35

    xor-int/lit8 v35, v120, -0x1

    and-int v35, v46, v35

    xor-int v29, v29, v35

    xor-int v35, v19, v115

    and-int v58, v75, v113

    xor-int v58, v19, v58

    xor-int/lit8 v58, v58, -0x1

    and-int v58, v46, v58

    xor-int v5, v5, v58

    or-int v58, v44, v3

    xor-int v58, v118, v58

    xor-int/lit8 v19, v19, -0x1

    and-int v19, v46, v19

    xor-int v19, v58, v19

    and-int v3, v70, v3

    xor-int v3, v3, v67

    or-int/2addr v3, v2

    xor-int v3, v116, v3

    xor-int v3, v3, p1

    iput v3, v1, Lcom/daaw/dl2;->o:I

    and-int v21, v21, v117

    xor-int v9, v9, v21

    and-int v9, v9, v71

    xor-int/2addr v9, v14

    and-int v9, v9, v114

    xor-int v9, v20, v9

    xor-int/2addr v9, v11

    iput v9, v1, Lcom/daaw/dl2;->b1:I

    and-int v9, v85, v12

    xor-int/lit8 v14, v9, -0x1

    xor-int v9, v9, v69

    or-int/2addr v9, v6

    xor-int/2addr v9, v12

    xor-int v9, v9, v54

    xor-int/lit8 v9, v9, -0x1

    and-int/2addr v9, v11

    and-int v11, v83, v14

    xor-int/lit8 v20, v11, -0x1

    and-int v20, v6, v20

    xor-int v20, v26, v20

    and-int v14, v85, v14

    xor-int/lit8 v14, v14, -0x1

    and-int v14, v83, v14

    xor-int v14, v66, v14

    xor-int/lit8 v14, v14, -0x1

    and-int/2addr v14, v6

    xor-int/lit8 v14, v14, -0x1

    and-int v14, v86, v14

    xor-int v14, v20, v14

    xor-int v14, v14, v82

    move/from16 p1, v2

    iget v2, v1, Lcom/daaw/dl2;->T:I

    xor-int/2addr v2, v14

    iput v2, v1, Lcom/daaw/dl2;->T:I

    xor-int/lit8 v14, v2, -0x1

    and-int/2addr v14, v13

    and-int v20, v60, v14

    xor-int/lit8 v21, v14, -0x1

    and-int v26, v60, v21

    move/from16 v46, v7

    xor-int v7, v20, v16

    iput v7, v1, Lcom/daaw/dl2;->w0:I

    and-int v7, v13, v21

    xor-int/lit8 v16, v7, -0x1

    and-int v16, v60, v16

    move/from16 p2, v4

    xor-int v4, v7, v37

    iput v4, v1, Lcom/daaw/dl2;->A0:I

    or-int v4, v17, v7

    xor-int/2addr v4, v7

    iput v4, v1, Lcom/daaw/dl2;->y0:I

    xor-int v4, v14, v57

    xor-int v21, v2, v13

    xor-int v37, v21, v16

    and-int v7, v7, v18

    xor-int v7, v37, v7

    iput v7, v1, Lcom/daaw/dl2;->K0:I

    and-int v7, v60, v2

    xor-int v7, v21, v7

    xor-int v7, v7, v17

    iput v7, v1, Lcom/daaw/dl2;->E0:I

    and-int v7, v2, v13

    and-int v37, v60, v7

    xor-int v7, v7, v16

    and-int v7, v7, v18

    xor-int v7, v20, v7

    iput v7, v1, Lcom/daaw/dl2;->P0:I

    or-int v7, v13, v2

    xor-int v16, v7, v37

    xor-int/lit8 v16, v16, -0x1

    and-int v16, v17, v16

    move/from16 v54, v15

    xor-int v15, v4, v16

    iput v15, v1, Lcom/daaw/dl2;->G0:I

    and-int v2, v2, v84

    and-int v15, v60, v2

    xor-int v16, v21, v15

    and-int v57, v26, v18

    move/from16 v58, v10

    xor-int v10, v16, v57

    iput v10, v1, Lcom/daaw/dl2;->s:I

    or-int v10, v13, v2

    xor-int/lit8 v13, v21, -0x1

    and-int v13, v60, v13

    xor-int/2addr v13, v10

    and-int v4, v4, v18

    xor-int/2addr v4, v13

    iput v4, v1, Lcom/daaw/dl2;->t0:I

    xor-int/lit8 v4, v7, -0x1

    and-int v4, v60, v4

    xor-int/2addr v4, v10

    xor-int v13, v7, v20

    and-int v16, v4, v18

    xor-int v13, v13, v16

    iput v13, v1, Lcom/daaw/dl2;->x1:I

    xor-int/2addr v7, v15

    xor-int/lit8 v7, v7, -0x1

    and-int v7, v17, v7

    xor-int/2addr v4, v7

    iput v4, v1, Lcom/daaw/dl2;->k1:I

    xor-int v4, v10, v26

    and-int v4, v4, v18

    xor-int v4, v37, v4

    iput v4, v1, Lcom/daaw/dl2;->r0:I

    xor-int/lit8 v2, v2, -0x1

    and-int v2, v60, v2

    xor-int/2addr v2, v14

    iput v2, v1, Lcom/daaw/dl2;->q0:I

    xor-int v2, v2, v53

    iput v2, v1, Lcom/daaw/dl2;->y1:I

    xor-int v2, v80, v11

    xor-int v2, v2, v33

    xor-int v2, v2, v78

    xor-int/2addr v2, v9

    iget v4, v1, Lcom/daaw/dl2;->R:I

    xor-int/2addr v2, v4

    iput v2, v1, Lcom/daaw/dl2;->R:I

    and-int v4, v2, v34

    or-int v7, v44, v4

    xor-int/lit8 v9, v47, -0x1

    and-int/2addr v9, v2

    and-int v9, v9, v113

    iput v9, v1, Lcom/daaw/dl2;->G1:I

    and-int v10, v2, v59

    xor-int v11, v52, v10

    and-int v11, v11, v113

    and-int v13, v2, v50

    xor-int v14, v59, v13

    and-int v15, v2, v49

    xor-int v4, v51, v4

    and-int v16, v15, v113

    xor-int v4, v4, v16

    or-int v4, v4, v68

    xor-int v15, v51, v15

    xor-int/lit8 v15, v15, -0x1

    and-int v15, v44, v15

    xor-int v13, v34, v13

    xor-int/lit8 v16, v49, -0x1

    move/from16 v17, v3

    and-int v3, v2, v16

    iput v3, v1, Lcom/daaw/dl2;->S0:I

    xor-int v10, v47, v10

    move/from16 v16, v8

    xor-int v8, v51, v2

    iput v8, v1, Lcom/daaw/dl2;->J0:I

    or-int v18, v44, v8

    xor-int v14, v14, v18

    iput v14, v1, Lcom/daaw/dl2;->e1:I

    and-int v18, v2, v47

    and-int v20, v18, v113

    move/from16 v21, v5

    xor-int v5, v34, v18

    iput v5, v1, Lcom/daaw/dl2;->p1:I

    and-int v18, v5, v113

    move/from16 v26, v6

    xor-int v6, v8, v18

    iput v6, v1, Lcom/daaw/dl2;->z0:I

    xor-int v18, v52, v20

    and-int v18, v18, v55

    xor-int v6, v6, v18

    iput v6, v1, Lcom/daaw/dl2;->o0:I

    xor-int/2addr v7, v5

    xor-int/2addr v4, v7

    xor-int v3, v3, v20

    or-int v3, v41, v3

    xor-int/2addr v3, v4

    iget v4, v1, Lcom/daaw/dl2;->u:I

    xor-int/2addr v3, v4

    iput v3, v1, Lcom/daaw/dl2;->u:I

    xor-int/lit8 v4, v3, -0x1

    and-int v7, v0, v4

    and-int v18, v0, v3

    and-int v20, v2, v52

    move/from16 v33, v4

    xor-int v4, v59, v20

    iput v4, v1, Lcom/daaw/dl2;->D0:I

    move/from16 v20, v7

    xor-int v7, v49, v2

    iput v7, v1, Lcom/daaw/dl2;->g1:I

    xor-int/lit8 v34, v10, -0x1

    and-int v34, v44, v34

    xor-int v34, v7, v34

    and-int v34, v34, v55

    xor-int v9, v9, v34

    or-int v9, v9, v41

    xor-int/2addr v6, v9

    xor-int v6, v6, v83

    iput v6, v1, Lcom/daaw/dl2;->I0:I

    and-int v6, v44, v10

    xor-int/2addr v6, v8

    xor-int/2addr v5, v15

    or-int v5, v68, v5

    xor-int/2addr v5, v6

    xor-int v6, v7, v11

    or-int v6, v6, v68

    xor-int/2addr v6, v14

    xor-int/lit8 v7, v41, -0x1

    and-int/2addr v6, v7

    xor-int/2addr v5, v6

    xor-int v5, v5, v45

    iput v5, v1, Lcom/daaw/dl2;->g:I

    xor-int v4, v4, v62

    xor-int/lit8 v6, v48, -0x1

    and-int/2addr v6, v2

    xor-int v6, v59, v6

    or-int v6, v44, v6

    xor-int v6, v52, v6

    and-int v6, v6, v55

    xor-int/2addr v4, v6

    and-int v2, v2, v31

    xor-int v2, v49, v2

    and-int v6, v8, v113

    xor-int/2addr v2, v6

    or-int v2, v2, v68

    xor-int/2addr v2, v13

    or-int v2, v2, v41

    xor-int/2addr v2, v4

    xor-int v2, v2, v64

    iput v2, v1, Lcom/daaw/dl2;->U:I

    iget v2, v1, Lcom/daaw/dl2;->r1:I

    iget v4, v1, Lcom/daaw/dl2;->t1:I

    xor-int/lit8 v2, v2, -0x1

    and-int/2addr v2, v12

    xor-int/2addr v2, v4

    iget v4, v1, Lcom/daaw/dl2;->V:I

    xor-int/2addr v2, v4

    iput v2, v1, Lcom/daaw/dl2;->V:I

    xor-int v4, v63, v24

    iget v6, v1, Lcom/daaw/dl2;->W:I

    xor-int/2addr v4, v6

    iput v4, v1, Lcom/daaw/dl2;->W:I

    iget v6, v1, Lcom/daaw/dl2;->O:I

    xor-int v7, v6, v4

    iget v8, v1, Lcom/daaw/dl2;->G:I

    and-int v9, v8, v7

    iget v10, v1, Lcom/daaw/dl2;->M0:I

    and-int v11, v26, v9

    xor-int/2addr v11, v10

    xor-int v12, v7, v8

    iget v13, v1, Lcom/daaw/dl2;->m0:I

    xor-int/2addr v13, v12

    iget v14, v1, Lcom/daaw/dl2;->T0:I

    iget v15, v1, Lcom/daaw/dl2;->y:I

    xor-int/lit8 v24, v15, -0x1

    xor-int/lit8 v31, v83, -0x1

    xor-int/lit8 v12, v12, -0x1

    and-int v12, v26, v12

    xor-int/2addr v12, v14

    and-int v12, v12, v24

    xor-int/2addr v12, v4

    and-int v12, v12, v31

    move/from16 v34, v2

    iget v2, v1, Lcom/daaw/dl2;->u1:I

    xor-int/2addr v2, v4

    xor-int/lit8 v37, v2, -0x1

    and-int v37, v26, v37

    xor-int v10, v10, v37

    and-int v10, v10, v24

    iput v10, v1, Lcom/daaw/dl2;->C0:I

    xor-int/lit8 v10, v4, -0x1

    or-int v37, v6, v4

    xor-int/lit8 v41, v37, -0x1

    and-int v41, v8, v41

    xor-int v44, v7, v41

    and-int v44, v44, v36

    xor-int/lit8 v45, v6, -0x1

    and-int v45, v4, v45

    xor-int/lit8 v47, v45, -0x1

    move/from16 v48, v9

    and-int v9, v4, v47

    iput v9, v1, Lcom/daaw/dl2;->J1:I

    and-int v47, v8, v47

    xor-int v41, v4, v41

    xor-int v49, v6, v47

    xor-int/lit8 v49, v49, -0x1

    and-int v49, v26, v49

    xor-int v41, v41, v49

    and-int v41, v41, v24

    and-int v49, v8, v45

    xor-int v49, v45, v49

    and-int v2, v26, v2

    xor-int v2, v49, v2

    or-int/2addr v2, v15

    move/from16 v49, v9

    iget v9, v1, Lcom/daaw/dl2;->a1:I

    xor-int v7, v7, v47

    xor-int/lit8 v47, v7, -0x1

    and-int v47, v26, v47

    xor-int v14, v14, v47

    xor-int/lit8 v14, v14, -0x1

    and-int/2addr v14, v15

    and-int v7, v26, v7

    move/from16 v47, v0

    and-int v0, v6, v10

    iput v0, v1, Lcom/daaw/dl2;->T0:I

    and-int v50, v26, v0

    xor-int v50, v0, v50

    and-int v50, v50, v24

    or-int/2addr v4, v0

    iput v4, v1, Lcom/daaw/dl2;->a1:I

    and-int v51, v8, v4

    xor-int v0, v0, v51

    and-int v0, v0, v36

    or-int/2addr v0, v15

    xor-int/2addr v0, v13

    xor-int v9, v45, v9

    and-int/2addr v10, v8

    xor-int v10, v37, v10

    xor-int/lit8 v10, v10, -0x1

    and-int v10, v26, v10

    xor-int/2addr v9, v10

    and-int v9, v9, v24

    xor-int/2addr v9, v11

    and-int v9, v9, v31

    xor-int/2addr v0, v9

    iget v9, v1, Lcom/daaw/dl2;->t:I

    xor-int/2addr v0, v9

    iput v0, v1, Lcom/daaw/dl2;->t:I

    xor-int/lit8 v9, v0, -0x1

    and-int v10, v65, v9

    xor-int v10, v76, v10

    xor-int v10, v10, v125

    xor-int v10, v10, v38

    iput v10, v1, Lcom/daaw/dl2;->S:I

    or-int v11, v0, v122

    xor-int v11, v119, v11

    and-int v13, v121, v9

    xor-int v13, v21, v13

    or-int v13, v16, v13

    xor-int/2addr v11, v13

    xor-int/2addr v11, v15

    iput v11, v1, Lcom/daaw/dl2;->y:I

    xor-int/lit8 v11, v16, -0x1

    or-int v13, v0, v40

    xor-int v13, v42, v13

    or-int v15, v0, v19

    xor-int v15, v35, v15

    and-int/2addr v15, v11

    xor-int/2addr v13, v15

    iget v15, v1, Lcom/daaw/dl2;->Q:I

    xor-int/2addr v13, v15

    iput v13, v1, Lcom/daaw/dl2;->Q:I

    and-int v9, v123, v9

    xor-int v9, v29, v9

    or-int v0, v0, v74

    xor-int v0, v43, v0

    and-int/2addr v0, v11

    xor-int/2addr v0, v9

    xor-int v0, v0, v39

    iput v0, v1, Lcom/daaw/dl2;->M:I

    and-int v9, v5, v0

    iput v9, v1, Lcom/daaw/dl2;->h1:I

    iput v9, v1, Lcom/daaw/dl2;->O0:I

    xor-int/2addr v9, v0

    iput v9, v1, Lcom/daaw/dl2;->d2:I

    or-int v9, v17, v0

    iput v9, v1, Lcom/daaw/dl2;->f2:I

    xor-int/2addr v0, v5

    xor-int v0, v0, v17

    iput v0, v1, Lcom/daaw/dl2;->F0:I

    xor-int v0, v6, v51

    xor-int v5, v0, v44

    xor-int/2addr v2, v5

    iput v2, v1, Lcom/daaw/dl2;->u1:I

    xor-int/2addr v0, v7

    xor-int v2, v0, v41

    xor-int/2addr v0, v14

    xor-int/2addr v0, v12

    iget v5, v1, Lcom/daaw/dl2;->p:I

    xor-int/2addr v0, v5

    iput v0, v1, Lcom/daaw/dl2;->p:I

    and-int v5, v0, v98

    xor-int v5, v105, v5

    xor-int v5, v5, v109

    xor-int/lit8 v6, v98, -0x1

    and-int/2addr v6, v0

    xor-int v6, v106, v6

    xor-int v6, v6, v89

    and-int v6, v61, v6

    xor-int/2addr v5, v6

    xor-int v5, v5, v32

    iput v5, v1, Lcom/daaw/dl2;->C:I

    or-int v6, v5, v3

    xor-int/lit8 v7, v6, -0x1

    and-int v7, v47, v7

    xor-int v9, v3, v7

    iput v9, v1, Lcom/daaw/dl2;->Z0:I

    xor-int/lit8 v9, v5, -0x1

    and-int v11, v47, v9

    iput v11, v1, Lcom/daaw/dl2;->T1:I

    iput v11, v1, Lcom/daaw/dl2;->Y0:I

    xor-int/lit8 v10, v10, -0x1

    and-int v12, v5, v10

    iput v12, v1, Lcom/daaw/dl2;->i1:I

    and-int v12, v47, v5

    iput v12, v1, Lcom/daaw/dl2;->W1:I

    and-int v12, v5, v3

    xor-int v12, v12, v20

    iput v12, v1, Lcom/daaw/dl2;->g2:I

    xor-int/2addr v11, v5

    iput v11, v1, Lcom/daaw/dl2;->t1:I

    and-int/2addr v10, v11

    iput v10, v1, Lcom/daaw/dl2;->z1:I

    and-int/2addr v9, v3

    xor-int/lit8 v10, v9, -0x1

    and-int v11, v47, v10

    xor-int/2addr v6, v11

    iput v6, v1, Lcom/daaw/dl2;->c2:I

    xor-int v6, v9, v47

    iput v6, v1, Lcom/daaw/dl2;->Q1:I

    xor-int v6, v5, v3

    xor-int v9, v6, v18

    iput v9, v1, Lcom/daaw/dl2;->W0:I

    and-int v9, v3, v10

    xor-int/lit8 v9, v9, -0x1

    and-int v9, v47, v9

    xor-int/2addr v9, v6

    iput v9, v1, Lcom/daaw/dl2;->m1:I

    xor-int/lit8 v6, v6, -0x1

    and-int v6, v47, v6

    xor-int/2addr v6, v3

    iput v6, v1, Lcom/daaw/dl2;->X0:I

    and-int v6, v5, v33

    and-int v9, v47, v6

    xor-int v10, v5, v9

    iput v10, v1, Lcom/daaw/dl2;->H1:I

    or-int/2addr v6, v3

    xor-int/2addr v6, v7

    iput v6, v1, Lcom/daaw/dl2;->X1:I

    xor-int/2addr v3, v9

    iput v3, v1, Lcom/daaw/dl2;->E1:I

    xor-int v3, v5, v20

    iput v3, v1, Lcom/daaw/dl2;->U0:I

    xor-int/lit8 v3, v87, -0x1

    and-int/2addr v3, v0

    xor-int v3, v91, v3

    and-int v5, v0, v87

    xor-int v5, v58, v5

    and-int v5, v56, v5

    xor-int/2addr v3, v5

    xor-int/lit8 v5, v102, -0x1

    and-int/2addr v5, v0

    xor-int v5, v5, v110

    xor-int/lit8 v5, v5, -0x1

    and-int v5, v61, v5

    xor-int/2addr v3, v5

    xor-int/2addr v3, v8

    iput v3, v1, Lcom/daaw/dl2;->G:I

    xor-int/lit8 v3, v100, -0x1

    and-int/2addr v3, v0

    xor-int v3, v108, v3

    xor-int v3, v3, v107

    and-int v5, v0, v103

    xor-int v5, v90, v5

    and-int v6, v0, v96

    xor-int v6, v95, v6

    xor-int/lit8 v6, v6, -0x1

    and-int v6, v56, v6

    xor-int/2addr v5, v6

    or-int v6, v97, v0

    xor-int v6, v102, v6

    or-int v7, v54, v0

    xor-int v7, v102, v7

    xor-int/lit8 v7, v7, -0x1

    and-int v7, v56, v7

    xor-int/2addr v6, v7

    and-int v6, v61, v6

    xor-int/2addr v5, v6

    xor-int v5, v5, v79

    iput v5, v1, Lcom/daaw/dl2;->c0:I

    xor-int/lit8 v6, p2, -0x1

    and-int/2addr v5, v6

    iput v5, v1, Lcom/daaw/dl2;->N1:I

    and-int v0, v0, v92

    xor-int v0, v104, v0

    xor-int v0, v0, v99

    xor-int/lit8 v0, v0, -0x1

    and-int v0, v61, v0

    xor-int/2addr v0, v3

    iget v3, v1, Lcom/daaw/dl2;->Y:I

    xor-int/2addr v0, v3

    iput v0, v1, Lcom/daaw/dl2;->Y:I

    xor-int v0, v4, v48

    and-int v0, v26, v0

    xor-int v0, v49, v0

    xor-int v0, v0, v50

    or-int v0, v83, v0

    xor-int/2addr v0, v2

    iget v2, v1, Lcom/daaw/dl2;->b:I

    xor-int/2addr v0, v2

    iput v0, v1, Lcom/daaw/dl2;->b:I

    xor-int/lit8 v2, v0, -0x1

    and-int v3, v46, v2

    xor-int v4, v3, v54

    iput v4, v1, Lcom/daaw/dl2;->L0:I

    xor-int v4, v30, v0

    iput v4, v1, Lcom/daaw/dl2;->c1:I

    or-int v5, v27, v4

    xor-int v6, v4, v81

    and-int v6, p1, v6

    iput v6, v1, Lcom/daaw/dl2;->w1:I

    and-int v6, v4, v22

    xor-int/2addr v6, v4

    xor-int v7, v6, v28

    xor-int/lit8 v7, v7, -0x1

    and-int v7, v112, v7

    iput v7, v1, Lcom/daaw/dl2;->R0:I

    xor-int v7, v4, v27

    iput v7, v1, Lcom/daaw/dl2;->U1:I

    xor-int v7, v0, v93

    xor-int v7, v7, v111

    and-int v8, v30, v0

    and-int v6, v6, p1

    xor-int/2addr v6, v8

    and-int v6, v112, v6

    xor-int v9, v8, v27

    or-int v9, p1, v9

    xor-int v10, v8, v25

    and-int v11, v10, v114

    and-int v11, v11, v112

    iput v11, v1, Lcom/daaw/dl2;->S1:I

    xor-int/lit8 v10, v10, -0x1

    and-int v10, p1, v10

    iput v10, v1, Lcom/daaw/dl2;->s1:I

    xor-int/lit8 v10, v8, -0x1

    and-int/2addr v10, v0

    iput v10, v1, Lcom/daaw/dl2;->a2:I

    and-int v10, v8, v22

    xor-int v10, v30, v10

    iput v10, v1, Lcom/daaw/dl2;->R1:I

    or-int v10, v54, v0

    xor-int v11, v3, v10

    xor-int/lit8 v11, v11, -0x1

    and-int v11, v112, v11

    iput v11, v1, Lcom/daaw/dl2;->b2:I

    or-int v11, v0, v46

    iput v11, v1, Lcom/daaw/dl2;->Y1:I

    or-int v12, v54, v11

    xor-int v12, v46, v12

    and-int v13, v11, v101

    xor-int v14, v3, v13

    iput v14, v1, Lcom/daaw/dl2;->Z1:I

    and-int v3, v3, v101

    xor-int/2addr v3, v11

    iput v13, v1, Lcom/daaw/dl2;->I1:I

    xor-int/lit8 v13, v46, -0x1

    and-int/2addr v11, v13

    or-int v14, v112, v11

    iput v14, v1, Lcom/daaw/dl2;->s0:I

    and-int v14, v0, v101

    iput v14, v1, Lcom/daaw/dl2;->C1:I

    or-int v15, v54, v11

    xor-int/lit8 v15, v15, -0x1

    and-int v15, v112, v15

    xor-int/2addr v15, v14

    iput v15, v1, Lcom/daaw/dl2;->f1:I

    and-int/2addr v13, v0

    iput v13, v1, Lcom/daaw/dl2;->N0:I

    and-int v13, v13, v101

    xor-int v15, v11, v13

    move/from16 p2, v2

    or-int v2, v112, v15

    iput v2, v1, Lcom/daaw/dl2;->v0:I

    xor-int/lit8 v2, v34, -0x1

    xor-int v15, v15, v94

    and-int/2addr v15, v2

    iput v15, v1, Lcom/daaw/dl2;->P1:I

    iput v13, v1, Lcom/daaw/dl2;->F1:I

    or-int v13, v27, v0

    and-int v15, v10, v88

    xor-int/2addr v15, v14

    or-int v15, v34, v15

    iput v15, v1, Lcom/daaw/dl2;->m0:I

    or-int v10, v112, v10

    xor-int/2addr v3, v10

    or-int v3, v34, v3

    xor-int/2addr v3, v7

    iput v3, v1, Lcom/daaw/dl2;->u0:I

    xor-int/lit8 v3, v30, -0x1

    and-int/2addr v3, v0

    and-int v7, v0, v22

    xor-int v10, v3, v7

    and-int v10, v10, p1

    xor-int/2addr v10, v8

    xor-int/2addr v6, v10

    xor-int/lit8 v6, v6, -0x1

    and-int v6, v23, v6

    iput v6, v1, Lcom/daaw/dl2;->V0:I

    xor-int v6, v11, v14

    or-int v6, v112, v6

    xor-int/2addr v6, v12

    and-int/2addr v2, v6

    iput v2, v1, Lcom/daaw/dl2;->H0:I

    iput v13, v1, Lcom/daaw/dl2;->p0:I

    xor-int v2, v4, v13

    xor-int/2addr v3, v5

    xor-int/lit8 v3, v3, -0x1

    and-int v3, p1, v3

    xor-int/2addr v3, v2

    and-int v3, v3, v88

    xor-int/2addr v3, v10

    xor-int/lit8 v3, v3, -0x1

    and-int v3, v23, v3

    iput v3, v1, Lcom/daaw/dl2;->V1:I

    xor-int/2addr v2, v9

    xor-int v2, v2, v112

    iput v2, v1, Lcom/daaw/dl2;->n:I

    iput v7, v1, Lcom/daaw/dl2;->e2:I

    or-int v0, v30, v0

    iput v0, v1, Lcom/daaw/dl2;->r1:I

    xor-int v2, v0, v13

    and-int v2, v2, v114

    xor-int/2addr v2, v8

    xor-int/lit8 v2, v2, -0x1

    and-int v2, v112, v2

    iput v2, v1, Lcom/daaw/dl2;->M0:I

    and-int v0, v0, p2

    iput v0, v1, Lcom/daaw/dl2;->q1:I

    return-void
.end method
