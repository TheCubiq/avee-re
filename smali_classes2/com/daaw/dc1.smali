.class public Lcom/daaw/dc1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/dc1$a;
    }
.end annotation


# static fields
.field public static i:Z


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public d:[Lcom/daaw/dc1$a;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:I

.field public h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/dc1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/ls1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/dc1;->c:Ljava/util/HashMap;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-static {}, Lcom/daaw/dc1;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/daaw/dc1;->e:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/dc1;->f:Ljava/lang/String;

    const v0, 0x8b31

    invoke-virtual {p0, v0, p1}, Lcom/daaw/dc1;->c(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/daaw/dc1;->g:I

    const p1, 0x8b30

    invoke-virtual {p0, p1, p2}, Lcom/daaw/dc1;->c(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/daaw/dc1;->h:I

    invoke-virtual {p0}, Lcom/daaw/dc1;->d()I

    move-result p1

    iput p1, p0, Lcom/daaw/dc1;->a:I

    :try_start_0
    invoke-virtual {p0, p3}, Lcom/daaw/dc1;->n(Ljava/util/List;)V
    :try_end_0
    .catch Lcom/daaw/qi0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lcom/daaw/dc1;->e()V

    throw p1

    :cond_0
    new-instance p1, Lcom/daaw/qi0;

    const-string p2, "no shader support found; shaders require OpenGL 2.0"

    invoke-direct {p1, p2}, Lcom/daaw/qi0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "shader source must be non-null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget v0, p0, Lcom/daaw/dc1;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/dc1;->j()I

    move-result v0

    iget v1, p0, Lcom/daaw/dc1;->g:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-virtual {p0}, Lcom/daaw/dc1;->j()I

    move-result v0

    iget v1, p0, Lcom/daaw/dc1;->h:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/daaw/dc1$a;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/dc1;->d:[Lcom/daaw/dc1$a;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    iget-object v1, v1, Lcom/daaw/dc1$a;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/daaw/dc1;->d:[Lcom/daaw/dc1$a;

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    sget-boolean v0, Lcom/daaw/dc1;->i:Z

    if-nez v0, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no active attribute by name \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' (disable strict compiling to suppress warnings)"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public c(ILjava/lang/String;)I
    .locals 5

    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v0, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const/4 p2, 0x1

    new-array p2, p2, [I

    const v1, 0x8b81

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, v2}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    aget p2, p2, v2

    invoke-virtual {p0, p1}, Lcom/daaw/dc1;->y(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " compile log:\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    :cond_0
    if-nez p2, :cond_2

    new-instance p2, Lcom/daaw/qi0;

    iget-object v0, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not compile "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/daaw/dc1;->y(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p2, p1}, Lcom/daaw/qi0;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    return v0

    :cond_3
    new-instance p1, Lcom/daaw/qi0;

    const-string p2, "could not create shader obj; check ShaderProgram.isSupported()"

    invoke-direct {p1, p2}, Lcom/daaw/qi0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d()I
    .locals 2

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    new-instance v0, Lcom/daaw/qi0;

    const-string v1, "could not create program; check ShaderProgram.isSupported()"

    invoke-direct {v0, v1}, Lcom/daaw/qi0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()V
    .locals 1

    iget v0, p0, Lcom/daaw/dc1;->a:I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/dc1;->f()V

    iget v0, p0, Lcom/daaw/dc1;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dc1;->a:I

    :cond_0
    return-void
.end method

.method public f()V
    .locals 3

    iget v0, p0, Lcom/daaw/dc1;->g:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/dc1;->j()I

    move-result v0

    iget v2, p0, Lcom/daaw/dc1;->g:I

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glDetachShader(II)V

    iget v0, p0, Lcom/daaw/dc1;->g:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    iput v1, p0, Lcom/daaw/dc1;->g:I

    :cond_0
    iget v0, p0, Lcom/daaw/dc1;->h:I

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/dc1;->j()I

    move-result v0

    iget v2, p0, Lcom/daaw/dc1;->h:I

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glDetachShader(II)V

    iget v0, p0, Lcom/daaw/dc1;->h:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    iput v1, p0, Lcom/daaw/dc1;->h:I

    :cond_1
    return-void
.end method

.method public final g()V
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x1

    new-array v2, v1, [I

    iget v3, v0, Lcom/daaw/dc1;->a:I

    const v4, 0x8b89

    const/4 v5, 0x0

    invoke-static {v3, v4, v2, v5}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v2, v2, v5

    new-array v3, v1, [I

    new-array v4, v1, [I

    new-array v1, v1, [I

    const/16 v6, 0x40

    new-array v15, v6, [B

    new-array v6, v2, [Lcom/daaw/dc1$a;

    iput-object v6, v0, Lcom/daaw/dc1;->d:[Lcom/daaw/dc1$a;

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v2, :cond_0

    new-instance v13, Lcom/daaw/dc1$a;

    invoke-direct {v13}, Lcom/daaw/dc1$a;-><init>()V

    iget v6, v0, Lcom/daaw/dc1;->a:I

    const/16 v8, 0x40

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v7, v14

    move-object v9, v3

    move-object v11, v4

    move-object/from16 v18, v13

    move-object v13, v1

    move/from16 v19, v14

    move/from16 v14, v16

    move-object/from16 v20, v15

    move/from16 v16, v17

    invoke-static/range {v6 .. v16}, Landroid/opengl/GLES20;->glGetActiveAttrib(III[II[II[II[BI)V

    new-instance v6, Ljava/lang/String;

    aget v7, v3, v5

    move-object/from16 v8, v20

    invoke-direct {v6, v8, v5, v7}, Ljava/lang/String;-><init>([BII)V

    move-object/from16 v7, v18

    iput-object v6, v7, Lcom/daaw/dc1$a;->a:Ljava/lang/String;

    iget v9, v0, Lcom/daaw/dc1;->a:I

    invoke-static {v9, v6}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v6

    iput v6, v7, Lcom/daaw/dc1$a;->b:I

    iget-object v6, v0, Lcom/daaw/dc1;->d:[Lcom/daaw/dc1$a;

    aput-object v7, v6, v19

    add-int/lit8 v14, v19, 0x1

    move-object v15, v8

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 20

    move-object/from16 v0, p0

    const/4 v1, 0x1

    new-array v2, v1, [I

    iget v3, v0, Lcom/daaw/dc1;->a:I

    const v4, 0x8b86

    const/4 v5, 0x0

    invoke-static {v3, v4, v2, v5}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v2, v2, v5

    new-array v3, v1, [I

    new-array v4, v1, [I

    new-array v1, v1, [I

    const/16 v15, 0x40

    new-array v14, v15, [B

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v2, :cond_3

    iget v6, v0, Lcom/daaw/dc1;->a:I

    const/16 v8, 0x40

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v7, v13

    move-object v9, v3

    move-object v11, v4

    move/from16 v18, v13

    move-object v13, v1

    move-object/from16 v19, v14

    move/from16 v14, v16

    move-object/from16 v15, v19

    move/from16 v16, v17

    invoke-static/range {v6 .. v16}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    aget v6, v3, v5

    if-nez v6, :cond_0

    const/16 v7, 0x40

    :goto_1
    move-object/from16 v8, v19

    if-ge v6, v7, :cond_1

    aget-byte v9, v8, v6

    if-eqz v9, :cond_1

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v19, v8

    goto :goto_1

    :cond_0
    move-object/from16 v8, v19

    const/16 v7, 0x40

    :cond_1
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v8, v5, v6}, Ljava/lang/String;-><init>([BII)V

    const-string v6, " "

    invoke-virtual {v9, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v9, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v9, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    :cond_2
    iget v6, v0, Lcom/daaw/dc1;->a:I

    invoke-static {v6, v9}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v6

    iget-object v10, v0, Lcom/daaw/dc1;->c:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v10, v9, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v13, v18, 0x1

    move-object v14, v8

    const/16 v15, 0x40

    goto :goto_0

    :cond_3
    return-void
.end method

.method public i(Ljava/lang/String;)I
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dc1;->b(Ljava/lang/String;)Lcom/daaw/dc1$a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Lcom/daaw/dc1$a;->b:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lcom/daaw/dc1;->a:I

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public l(Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Lcom/daaw/dc1;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/dc1;->a:I

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/dc1;->c:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    sget-boolean v1, Lcom/daaw/dc1;->i:Z

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no active uniform by name \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' (disable strict compiling to suppress warnings)"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return v0
.end method

.method public n(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/ls1;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/dc1;->A()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/daaw/dc1;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ls1;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/daaw/dc1;->a:I

    iget v2, v0, Lcom/daaw/ls1;->c:I

    iget-object v0, v0, Lcom/daaw/ls1;->a:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/dc1;->a()V

    iget p1, p0, Lcom/daaw/dc1;->a:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x1

    new-array p1, p1, [I

    iget v0, p0, Lcom/daaw/dc1;->a:I

    const v1, 0x8b82

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget p1, p1, v2

    iget v0, p0, Lcom/daaw/dc1;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    :cond_2
    iget-object v0, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    :cond_3
    if-nez p1, :cond_5

    new-instance p1, Lcom/daaw/qi0;

    iget-object v0, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/daaw/dc1;->b:Ljava/lang/String;

    goto :goto_1

    :cond_4
    const-string v0, "Could not link program"

    :goto_1
    invoke-direct {p1, v0}, Lcom/daaw/qi0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/dc1;->h()V

    invoke-virtual {p0}, Lcom/daaw/dc1;->g()V

    return-void

    :cond_6
    new-instance p1, Lcom/daaw/qi0;

    const-string v0, "trying to link an invalid (i.e. released) program"

    invoke-direct {p1, v0}, Lcom/daaw/qi0;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public o(IF)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    return-void
.end method

.method public p(IFF)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2, p3}, Landroid/opengl/GLES20;->glUniform2f(IFF)V

    return-void
.end method

.method public q(IFFF)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2, p3, p4}, Landroid/opengl/GLES20;->glUniform3f(IFFF)V

    return-void
.end method

.method public r(IFFFF)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2, p3, p4, p5}, Landroid/opengl/GLES20;->glUniform4f(IFFFF)V

    return-void
.end method

.method public s(Ljava/lang/String;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dc1;->l(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/dc1;->o(IF)V

    return-void
.end method

.method public t(Ljava/lang/String;FF)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dc1;->l(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/dc1;->p(IFF)V

    return-void
.end method

.method public u(Ljava/lang/String;FFF)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dc1;->l(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/dc1;->q(IFFF)V

    return-void
.end method

.method public v(Ljava/lang/String;FFFF)V
    .locals 6

    invoke-virtual {p0, p1}, Lcom/daaw/dc1;->l(Ljava/lang/String;)I

    move-result v1

    move-object v0, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/dc1;->r(IFFFF)V

    return-void
.end method

.method public w(II)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glUniform1i(II)V

    return-void
.end method

.method public x(Ljava/lang/String;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dc1;->l(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/dc1;->w(II)V

    return-void
.end method

.method public final y(I)Ljava/lang/String;
    .locals 1

    const v0, 0x8b30

    if-ne p1, v0, :cond_0

    const-string p1, "FRAGMENT_SHADER"

    return-object p1

    :cond_0
    const v0, 0x8b31

    if-ne p1, v0, :cond_1

    const-string p1, "VERTEX_SHADER"

    return-object p1

    :cond_1
    const-string p1, "shader"

    return-object p1
.end method

.method public z()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/dc1;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/dc1;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "trying to enable a program that is not valid"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
