.class public Lcom/daaw/px1$c;
.super Lcom/daaw/px1$f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/px1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static e:Ljava/lang/reflect/Field;

.field public static f:Z

.field public static g:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Landroid/view/WindowInsets;",
            ">;"
        }
    .end annotation
.end field

.field public static h:Z


# instance fields
.field public c:Landroid/view/WindowInsets;

.field public d:Lcom/daaw/gg0;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/px1$f;-><init>()V

    invoke-static {}, Lcom/daaw/px1$c;->h()Landroid/view/WindowInsets;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/px1$c;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/px1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/px1$f;-><init>(Lcom/daaw/px1;)V

    invoke-virtual {p1}, Lcom/daaw/px1;->v()Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/px1$c;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method private static h()Landroid/view/WindowInsets;
    .locals 6

    sget-boolean v0, Lcom/daaw/px1$c;->f:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    :try_start_0
    const-class v0, Landroid/view/WindowInsets;

    const-string v2, "CONSUMED"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lcom/daaw/px1$c;->e:Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-boolean v1, Lcom/daaw/px1$c;->f:Z

    :cond_0
    sget-object v0, Lcom/daaw/px1$c;->e:Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowInsets;

    if-eqz v0, :cond_1

    new-instance v3, Landroid/view/WindowInsets;

    invoke-direct {v3, v0}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V
    :try_end_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v3

    :catch_1
    nop

    :cond_1
    sget-boolean v0, Lcom/daaw/px1$c;->h:Z

    const/4 v3, 0x0

    if-nez v0, :cond_2

    :try_start_2
    const-class v0, Landroid/view/WindowInsets;

    new-array v4, v1, [Ljava/lang/Class;

    const-class v5, Landroid/graphics/Rect;

    aput-object v5, v4, v3

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    sput-object v0, Lcom/daaw/px1$c;->g:Ljava/lang/reflect/Constructor;
    :try_end_2
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-boolean v1, Lcom/daaw/px1$c;->h:Z

    :cond_2
    sget-object v0, Lcom/daaw/px1$c;->g:Ljava/lang/reflect/Constructor;

    if-eqz v0, :cond_3

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    aput-object v4, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowInsets;
    :try_end_3
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_3 .. :try_end_3} :catch_3

    return-object v0

    :catch_3
    :cond_3
    return-object v2
.end method


# virtual methods
.method public b()Lcom/daaw/px1;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/px1$f;->a()V

    iget-object v0, p0, Lcom/daaw/px1$c;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Lcom/daaw/px1;->w(Landroid/view/WindowInsets;)Lcom/daaw/px1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/px1$f;->b:[Lcom/daaw/gg0;

    invoke-virtual {v0, v1}, Lcom/daaw/px1;->r([Lcom/daaw/gg0;)V

    iget-object v1, p0, Lcom/daaw/px1$c;->d:Lcom/daaw/gg0;

    invoke-virtual {v0, v1}, Lcom/daaw/px1;->u(Lcom/daaw/gg0;)V

    return-object v0
.end method

.method public d(Lcom/daaw/gg0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/px1$c;->d:Lcom/daaw/gg0;

    return-void
.end method

.method public f(Lcom/daaw/gg0;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/px1$c;->c:Landroid/view/WindowInsets;

    if-eqz v0, :cond_0

    iget v1, p1, Lcom/daaw/gg0;->a:I

    iget v2, p1, Lcom/daaw/gg0;->b:I

    iget v3, p1, Lcom/daaw/gg0;->c:I

    iget p1, p1, Lcom/daaw/gg0;->d:I

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/px1$c;->c:Landroid/view/WindowInsets;

    :cond_0
    return-void
.end method
