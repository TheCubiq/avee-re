.class public final enum Lcom/daaw/bs7;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum A:Lcom/daaw/bs7;

.field public static final enum B:Lcom/daaw/bs7;

.field public static final enum C:Lcom/daaw/bs7;

.field public static final enum D:Lcom/daaw/bs7;

.field public static final enum E:Lcom/daaw/bs7;

.field public static final enum F:Lcom/daaw/bs7;

.field public static final enum G:Lcom/daaw/bs7;

.field public static final enum H:Lcom/daaw/bs7;

.field public static final enum I:Lcom/daaw/bs7;

.field public static final enum J:Lcom/daaw/bs7;

.field public static final enum K:Lcom/daaw/bs7;

.field public static final enum L:Lcom/daaw/bs7;

.field public static final enum M:Lcom/daaw/bs7;

.field public static final enum N:Lcom/daaw/bs7;

.field public static final enum O:Lcom/daaw/bs7;

.field public static final enum P:Lcom/daaw/bs7;

.field public static final enum Q:Lcom/daaw/bs7;

.field public static final enum R:Lcom/daaw/bs7;

.field public static final enum S:Lcom/daaw/bs7;

.field public static final enum T:Lcom/daaw/bs7;

.field public static final enum U:Lcom/daaw/bs7;

.field public static final enum V:Lcom/daaw/bs7;

.field public static final enum W:Lcom/daaw/bs7;

.field public static final enum X:Lcom/daaw/bs7;

.field public static final enum Y:Lcom/daaw/bs7;

.field public static final enum Z:Lcom/daaw/bs7;

.field public static final enum a0:Lcom/daaw/bs7;

.field public static final enum b0:Lcom/daaw/bs7;

.field public static final enum c0:Lcom/daaw/bs7;

.field public static final enum d0:Lcom/daaw/bs7;

.field public static final enum e0:Lcom/daaw/bs7;

.field public static final enum f0:Lcom/daaw/bs7;

.field public static final enum g0:Lcom/daaw/bs7;

.field public static final enum h0:Lcom/daaw/bs7;

.field public static final enum i0:Lcom/daaw/bs7;

.field public static final enum j0:Lcom/daaw/bs7;

.field public static final enum k0:Lcom/daaw/bs7;

.field public static final enum l0:Lcom/daaw/bs7;

.field public static final enum m0:Lcom/daaw/bs7;

.field public static final enum n0:Lcom/daaw/bs7;

.field public static final enum o0:Lcom/daaw/bs7;

.field public static final enum p0:Lcom/daaw/bs7;

.field public static final enum q0:Lcom/daaw/bs7;

.field public static final r0:[Lcom/daaw/bs7;

.field public static final enum s:Lcom/daaw/bs7;

.field public static final synthetic s0:[Lcom/daaw/bs7;

.field public static final enum t:Lcom/daaw/bs7;

.field public static final enum u:Lcom/daaw/bs7;

.field public static final enum v:Lcom/daaw/bs7;

.field public static final enum w:Lcom/daaw/bs7;

.field public static final enum x:Lcom/daaw/bs7;

.field public static final enum y:Lcom/daaw/bs7;

.field public static final enum z:Lcom/daaw/bs7;


# instance fields
.field public final p:Lcom/daaw/zs7;

.field public final q:I

.field public final r:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 63

    new-instance v6, Lcom/daaw/bs7;

    sget-object v7, Lcom/daaw/zs7;->w:Lcom/daaw/zs7;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v6, Lcom/daaw/bs7;->s:Lcom/daaw/bs7;

    new-instance v14, Lcom/daaw/bs7;

    sget-object v15, Lcom/daaw/zs7;->v:Lcom/daaw/zs7;

    const-string v9, "FLOAT"

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x1

    move-object v8, v14

    move-object v13, v15

    invoke-direct/range {v8 .. v13}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v14, Lcom/daaw/bs7;->t:Lcom/daaw/bs7;

    new-instance v8, Lcom/daaw/bs7;

    sget-object v9, Lcom/daaw/zs7;->u:Lcom/daaw/zs7;

    const-string v1, "INT64"

    const/4 v2, 0x2

    const/4 v3, 0x2

    move-object v0, v8

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v8, Lcom/daaw/bs7;->u:Lcom/daaw/bs7;

    new-instance v10, Lcom/daaw/bs7;

    const-string v1, "UINT64"

    const/4 v2, 0x3

    const/4 v3, 0x3

    move-object v0, v10

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v10, Lcom/daaw/bs7;->v:Lcom/daaw/bs7;

    new-instance v11, Lcom/daaw/bs7;

    sget-object v12, Lcom/daaw/zs7;->t:Lcom/daaw/zs7;

    const-string v17, "INT32"

    const/16 v18, 0x4

    const/16 v19, 0x4

    const/16 v20, 0x1

    move-object/from16 v16, v11

    move-object/from16 v21, v12

    invoke-direct/range {v16 .. v21}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v11, Lcom/daaw/bs7;->w:Lcom/daaw/bs7;

    new-instance v13, Lcom/daaw/bs7;

    const-string v1, "FIXED64"

    const/4 v2, 0x5

    const/4 v3, 0x5

    move-object v0, v13

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v13, Lcom/daaw/bs7;->x:Lcom/daaw/bs7;

    new-instance v16, Lcom/daaw/bs7;

    const-string v1, "FIXED32"

    const/4 v2, 0x6

    const/4 v3, 0x6

    move-object/from16 v0, v16

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v16, Lcom/daaw/bs7;->y:Lcom/daaw/bs7;

    new-instance v23, Lcom/daaw/bs7;

    sget-object v24, Lcom/daaw/zs7;->x:Lcom/daaw/zs7;

    const-string v18, "BOOL"

    const/16 v19, 0x7

    const/16 v20, 0x7

    const/16 v21, 0x1

    move-object/from16 v17, v23

    move-object/from16 v22, v24

    invoke-direct/range {v17 .. v22}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v23, Lcom/daaw/bs7;->z:Lcom/daaw/bs7;

    new-instance v17, Lcom/daaw/bs7;

    sget-object v18, Lcom/daaw/zs7;->y:Lcom/daaw/zs7;

    const-string v1, "STRING"

    const/16 v2, 0x8

    const/16 v3, 0x8

    move-object/from16 v0, v17

    move-object/from16 v5, v18

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v17, Lcom/daaw/bs7;->A:Lcom/daaw/bs7;

    new-instance v19, Lcom/daaw/bs7;

    sget-object v20, Lcom/daaw/zs7;->B:Lcom/daaw/zs7;

    const-string v26, "MESSAGE"

    const/16 v27, 0x9

    const/16 v28, 0x9

    const/16 v29, 0x1

    move-object/from16 v25, v19

    move-object/from16 v30, v20

    invoke-direct/range {v25 .. v30}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v19, Lcom/daaw/bs7;->B:Lcom/daaw/bs7;

    new-instance v21, Lcom/daaw/bs7;

    sget-object v22, Lcom/daaw/zs7;->z:Lcom/daaw/zs7;

    const-string v1, "BYTES"

    const/16 v2, 0xa

    const/16 v3, 0xa

    move-object/from16 v0, v21

    move-object/from16 v5, v22

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v21, Lcom/daaw/bs7;->C:Lcom/daaw/bs7;

    new-instance v25, Lcom/daaw/bs7;

    const-string v1, "UINT32"

    const/16 v2, 0xb

    const/16 v3, 0xb

    move-object/from16 v0, v25

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v25, Lcom/daaw/bs7;->D:Lcom/daaw/bs7;

    new-instance v32, Lcom/daaw/bs7;

    sget-object v33, Lcom/daaw/zs7;->A:Lcom/daaw/zs7;

    const-string v27, "ENUM"

    const/16 v28, 0xc

    const/16 v29, 0xc

    const/16 v30, 0x1

    move-object/from16 v26, v32

    move-object/from16 v31, v33

    invoke-direct/range {v26 .. v31}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v32, Lcom/daaw/bs7;->E:Lcom/daaw/bs7;

    new-instance v26, Lcom/daaw/bs7;

    const-string v1, "SFIXED32"

    const/16 v2, 0xd

    const/16 v3, 0xd

    move-object/from16 v0, v26

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v26, Lcom/daaw/bs7;->F:Lcom/daaw/bs7;

    new-instance v27, Lcom/daaw/bs7;

    const-string v1, "SFIXED64"

    const/16 v2, 0xe

    const/16 v3, 0xe

    move-object/from16 v0, v27

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v27, Lcom/daaw/bs7;->G:Lcom/daaw/bs7;

    new-instance v28, Lcom/daaw/bs7;

    const-string v1, "SINT32"

    const/16 v2, 0xf

    const/16 v3, 0xf

    move-object/from16 v0, v28

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v28, Lcom/daaw/bs7;->H:Lcom/daaw/bs7;

    new-instance v29, Lcom/daaw/bs7;

    const-string v1, "SINT64"

    const/16 v2, 0x10

    const/16 v3, 0x10

    move-object/from16 v0, v29

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v29, Lcom/daaw/bs7;->I:Lcom/daaw/bs7;

    new-instance v30, Lcom/daaw/bs7;

    const-string v1, "GROUP"

    const/16 v2, 0x11

    const/16 v3, 0x11

    move-object/from16 v0, v30

    move-object/from16 v5, v20

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v30, Lcom/daaw/bs7;->J:Lcom/daaw/bs7;

    new-instance v31, Lcom/daaw/bs7;

    const-string v1, "DOUBLE_LIST"

    const/16 v2, 0x12

    const/16 v3, 0x12

    const/4 v4, 0x2

    move-object/from16 v0, v31

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v31, Lcom/daaw/bs7;->K:Lcom/daaw/bs7;

    new-instance v34, Lcom/daaw/bs7;

    const-string v1, "FLOAT_LIST"

    const/16 v2, 0x13

    const/16 v3, 0x13

    move-object/from16 v0, v34

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v34, Lcom/daaw/bs7;->L:Lcom/daaw/bs7;

    new-instance v35, Lcom/daaw/bs7;

    const-string v1, "INT64_LIST"

    const/16 v2, 0x14

    const/16 v3, 0x14

    move-object/from16 v0, v35

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v35, Lcom/daaw/bs7;->M:Lcom/daaw/bs7;

    new-instance v36, Lcom/daaw/bs7;

    const-string v1, "UINT64_LIST"

    const/16 v2, 0x15

    const/16 v3, 0x15

    move-object/from16 v0, v36

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v36, Lcom/daaw/bs7;->N:Lcom/daaw/bs7;

    new-instance v37, Lcom/daaw/bs7;

    const-string v1, "INT32_LIST"

    const/16 v2, 0x16

    const/16 v3, 0x16

    move-object/from16 v0, v37

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v37, Lcom/daaw/bs7;->O:Lcom/daaw/bs7;

    new-instance v38, Lcom/daaw/bs7;

    const-string v1, "FIXED64_LIST"

    const/16 v2, 0x17

    const/16 v3, 0x17

    move-object/from16 v0, v38

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v38, Lcom/daaw/bs7;->P:Lcom/daaw/bs7;

    new-instance v39, Lcom/daaw/bs7;

    const-string v1, "FIXED32_LIST"

    const/16 v2, 0x18

    const/16 v3, 0x18

    move-object/from16 v0, v39

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v39, Lcom/daaw/bs7;->Q:Lcom/daaw/bs7;

    new-instance v40, Lcom/daaw/bs7;

    const-string v1, "BOOL_LIST"

    const/16 v2, 0x19

    const/16 v3, 0x19

    move-object/from16 v0, v40

    move-object/from16 v5, v24

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v40, Lcom/daaw/bs7;->R:Lcom/daaw/bs7;

    new-instance v41, Lcom/daaw/bs7;

    const-string v1, "STRING_LIST"

    const/16 v2, 0x1a

    const/16 v3, 0x1a

    move-object/from16 v0, v41

    move-object/from16 v5, v18

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v41, Lcom/daaw/bs7;->S:Lcom/daaw/bs7;

    new-instance v18, Lcom/daaw/bs7;

    const-string v1, "MESSAGE_LIST"

    const/16 v2, 0x1b

    const/16 v3, 0x1b

    move-object/from16 v0, v18

    move-object/from16 v5, v20

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v18, Lcom/daaw/bs7;->T:Lcom/daaw/bs7;

    new-instance v42, Lcom/daaw/bs7;

    const-string v1, "BYTES_LIST"

    const/16 v2, 0x1c

    const/16 v3, 0x1c

    move-object/from16 v0, v42

    move-object/from16 v5, v22

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v42, Lcom/daaw/bs7;->U:Lcom/daaw/bs7;

    new-instance v22, Lcom/daaw/bs7;

    const-string v1, "UINT32_LIST"

    const/16 v2, 0x1d

    const/16 v3, 0x1d

    move-object/from16 v0, v22

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v22, Lcom/daaw/bs7;->V:Lcom/daaw/bs7;

    new-instance v43, Lcom/daaw/bs7;

    const-string v1, "ENUM_LIST"

    const/16 v2, 0x1e

    const/16 v3, 0x1e

    move-object/from16 v0, v43

    move-object/from16 v5, v33

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v43, Lcom/daaw/bs7;->W:Lcom/daaw/bs7;

    new-instance v44, Lcom/daaw/bs7;

    const-string v1, "SFIXED32_LIST"

    const/16 v2, 0x1f

    const/16 v3, 0x1f

    move-object/from16 v0, v44

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v44, Lcom/daaw/bs7;->X:Lcom/daaw/bs7;

    new-instance v45, Lcom/daaw/bs7;

    const-string v1, "SFIXED64_LIST"

    const/16 v2, 0x20

    const/16 v3, 0x20

    move-object/from16 v0, v45

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v45, Lcom/daaw/bs7;->Y:Lcom/daaw/bs7;

    new-instance v46, Lcom/daaw/bs7;

    const-string v1, "SINT32_LIST"

    const/16 v2, 0x21

    const/16 v3, 0x21

    move-object/from16 v0, v46

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v46, Lcom/daaw/bs7;->Z:Lcom/daaw/bs7;

    new-instance v47, Lcom/daaw/bs7;

    const-string v1, "SINT64_LIST"

    const/16 v2, 0x22

    const/16 v3, 0x22

    move-object/from16 v0, v47

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v47, Lcom/daaw/bs7;->a0:Lcom/daaw/bs7;

    new-instance v48, Lcom/daaw/bs7;

    const-string v1, "DOUBLE_LIST_PACKED"

    const/16 v2, 0x23

    const/16 v3, 0x23

    const/4 v4, 0x3

    move-object/from16 v0, v48

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v48, Lcom/daaw/bs7;->b0:Lcom/daaw/bs7;

    new-instance v7, Lcom/daaw/bs7;

    const-string v1, "FLOAT_LIST_PACKED"

    const/16 v2, 0x24

    const/16 v3, 0x24

    move-object v0, v7

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v7, Lcom/daaw/bs7;->c0:Lcom/daaw/bs7;

    new-instance v15, Lcom/daaw/bs7;

    const-string v1, "INT64_LIST_PACKED"

    const/16 v2, 0x25

    const/16 v3, 0x25

    move-object v0, v15

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v15, Lcom/daaw/bs7;->d0:Lcom/daaw/bs7;

    new-instance v49, Lcom/daaw/bs7;

    const-string v1, "UINT64_LIST_PACKED"

    const/16 v2, 0x26

    const/16 v3, 0x26

    move-object/from16 v0, v49

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v49, Lcom/daaw/bs7;->e0:Lcom/daaw/bs7;

    new-instance v50, Lcom/daaw/bs7;

    const-string v1, "INT32_LIST_PACKED"

    const/16 v2, 0x27

    const/16 v3, 0x27

    move-object/from16 v0, v50

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v50, Lcom/daaw/bs7;->f0:Lcom/daaw/bs7;

    new-instance v51, Lcom/daaw/bs7;

    const-string v1, "FIXED64_LIST_PACKED"

    const/16 v2, 0x28

    const/16 v3, 0x28

    move-object/from16 v0, v51

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v51, Lcom/daaw/bs7;->g0:Lcom/daaw/bs7;

    new-instance v52, Lcom/daaw/bs7;

    const-string v1, "FIXED32_LIST_PACKED"

    const/16 v2, 0x29

    const/16 v3, 0x29

    move-object/from16 v0, v52

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v52, Lcom/daaw/bs7;->h0:Lcom/daaw/bs7;

    new-instance v53, Lcom/daaw/bs7;

    const-string v1, "BOOL_LIST_PACKED"

    const/16 v2, 0x2a

    const/16 v3, 0x2a

    move-object/from16 v0, v53

    move-object/from16 v5, v24

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v53, Lcom/daaw/bs7;->i0:Lcom/daaw/bs7;

    new-instance v24, Lcom/daaw/bs7;

    const-string v1, "UINT32_LIST_PACKED"

    const/16 v2, 0x2b

    const/16 v3, 0x2b

    move-object/from16 v0, v24

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v24, Lcom/daaw/bs7;->j0:Lcom/daaw/bs7;

    new-instance v54, Lcom/daaw/bs7;

    const-string v1, "ENUM_LIST_PACKED"

    const/16 v2, 0x2c

    const/16 v3, 0x2c

    move-object/from16 v0, v54

    move-object/from16 v5, v33

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v54, Lcom/daaw/bs7;->k0:Lcom/daaw/bs7;

    new-instance v33, Lcom/daaw/bs7;

    const-string v1, "SFIXED32_LIST_PACKED"

    const/16 v2, 0x2d

    const/16 v3, 0x2d

    move-object/from16 v0, v33

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v33, Lcom/daaw/bs7;->l0:Lcom/daaw/bs7;

    new-instance v55, Lcom/daaw/bs7;

    const-string v1, "SFIXED64_LIST_PACKED"

    const/16 v2, 0x2e

    const/16 v3, 0x2e

    move-object/from16 v0, v55

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v55, Lcom/daaw/bs7;->m0:Lcom/daaw/bs7;

    new-instance v56, Lcom/daaw/bs7;

    const-string v1, "SINT32_LIST_PACKED"

    const/16 v2, 0x2f

    const/16 v3, 0x2f

    move-object/from16 v0, v56

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v56, Lcom/daaw/bs7;->n0:Lcom/daaw/bs7;

    new-instance v12, Lcom/daaw/bs7;

    const-string v1, "SINT64_LIST_PACKED"

    const/16 v2, 0x30

    const/16 v3, 0x30

    move-object v0, v12

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v12, Lcom/daaw/bs7;->o0:Lcom/daaw/bs7;

    new-instance v9, Lcom/daaw/bs7;

    const-string v1, "GROUP_LIST"

    const/16 v2, 0x31

    const/16 v3, 0x31

    const/4 v4, 0x2

    move-object v0, v9

    move-object/from16 v5, v20

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v9, Lcom/daaw/bs7;->p0:Lcom/daaw/bs7;

    new-instance v0, Lcom/daaw/bs7;

    sget-object v62, Lcom/daaw/zs7;->s:Lcom/daaw/zs7;

    const-string v58, "MAP"

    const/16 v59, 0x32

    const/16 v60, 0x32

    const/16 v61, 0x4

    move-object/from16 v57, v0

    invoke-direct/range {v57 .. v62}, Lcom/daaw/bs7;-><init>(Ljava/lang/String;IIILcom/daaw/zs7;)V

    sput-object v0, Lcom/daaw/bs7;->q0:Lcom/daaw/bs7;

    const/16 v1, 0x33

    new-array v1, v1, [Lcom/daaw/bs7;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    const/4 v3, 0x1

    aput-object v14, v1, v3

    const/4 v3, 0x2

    aput-object v8, v1, v3

    const/4 v3, 0x3

    aput-object v10, v1, v3

    const/4 v3, 0x4

    aput-object v11, v1, v3

    const/4 v3, 0x5

    aput-object v13, v1, v3

    const/4 v3, 0x6

    aput-object v16, v1, v3

    const/4 v3, 0x7

    aput-object v23, v1, v3

    const/16 v3, 0x8

    aput-object v17, v1, v3

    const/16 v3, 0x9

    aput-object v19, v1, v3

    const/16 v3, 0xa

    aput-object v21, v1, v3

    const/16 v3, 0xb

    aput-object v25, v1, v3

    const/16 v3, 0xc

    aput-object v32, v1, v3

    const/16 v3, 0xd

    aput-object v26, v1, v3

    const/16 v3, 0xe

    aput-object v27, v1, v3

    const/16 v3, 0xf

    aput-object v28, v1, v3

    const/16 v3, 0x10

    aput-object v29, v1, v3

    const/16 v3, 0x11

    aput-object v30, v1, v3

    const/16 v3, 0x12

    aput-object v31, v1, v3

    const/16 v3, 0x13

    aput-object v34, v1, v3

    const/16 v3, 0x14

    aput-object v35, v1, v3

    const/16 v3, 0x15

    aput-object v36, v1, v3

    const/16 v3, 0x16

    aput-object v37, v1, v3

    const/16 v3, 0x17

    aput-object v38, v1, v3

    const/16 v3, 0x18

    aput-object v39, v1, v3

    const/16 v3, 0x19

    aput-object v40, v1, v3

    const/16 v3, 0x1a

    aput-object v41, v1, v3

    const/16 v3, 0x1b

    aput-object v18, v1, v3

    const/16 v3, 0x1c

    aput-object v42, v1, v3

    const/16 v3, 0x1d

    aput-object v22, v1, v3

    const/16 v3, 0x1e

    aput-object v43, v1, v3

    const/16 v3, 0x1f

    aput-object v44, v1, v3

    const/16 v3, 0x20

    aput-object v45, v1, v3

    const/16 v3, 0x21

    aput-object v46, v1, v3

    const/16 v3, 0x22

    aput-object v47, v1, v3

    const/16 v3, 0x23

    aput-object v48, v1, v3

    const/16 v3, 0x24

    aput-object v7, v1, v3

    const/16 v3, 0x25

    aput-object v15, v1, v3

    const/16 v3, 0x26

    aput-object v49, v1, v3

    const/16 v3, 0x27

    aput-object v50, v1, v3

    const/16 v3, 0x28

    aput-object v51, v1, v3

    const/16 v3, 0x29

    aput-object v52, v1, v3

    const/16 v3, 0x2a

    aput-object v53, v1, v3

    const/16 v3, 0x2b

    aput-object v24, v1, v3

    const/16 v3, 0x2c

    aput-object v54, v1, v3

    const/16 v3, 0x2d

    aput-object v33, v1, v3

    const/16 v3, 0x2e

    aput-object v55, v1, v3

    const/16 v3, 0x2f

    aput-object v56, v1, v3

    const/16 v3, 0x30

    aput-object v12, v1, v3

    const/16 v3, 0x31

    aput-object v9, v1, v3

    const/16 v3, 0x32

    aput-object v0, v1, v3

    sput-object v1, Lcom/daaw/bs7;->s0:[Lcom/daaw/bs7;

    invoke-static {}, Lcom/daaw/bs7;->values()[Lcom/daaw/bs7;

    move-result-object v0

    array-length v1, v0

    new-array v3, v1, [Lcom/daaw/bs7;

    sput-object v3, Lcom/daaw/bs7;->r0:[Lcom/daaw/bs7;

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    sget-object v4, Lcom/daaw/bs7;->r0:[Lcom/daaw/bs7;

    iget v5, v3, Lcom/daaw/bs7;->q:I

    aput-object v3, v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILcom/daaw/zs7;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/daaw/bs7;->q:I

    iput-object p5, p0, Lcom/daaw/bs7;->p:Lcom/daaw/zs7;

    sget-object p1, Lcom/daaw/zs7;->s:Lcom/daaw/zs7;

    add-int/lit8 p1, p4, -0x1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_0

    const/4 p3, 0x3

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lcom/daaw/zs7;->a()Ljava/lang/Class;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/daaw/bs7;->r:Ljava/lang/Class;

    if-ne p4, p2, :cond_1

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    :cond_1
    return-void
.end method

.method public static values()[Lcom/daaw/bs7;
    .locals 1

    sget-object v0, Lcom/daaw/bs7;->s0:[Lcom/daaw/bs7;

    invoke-virtual {v0}, [Lcom/daaw/bs7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/bs7;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/daaw/bs7;->q:I

    return v0
.end method
