.class public final Lcom/daaw/mk1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/mk1$f;,
        Lcom/daaw/mk1$a;,
        Lcom/daaw/mk1$b;,
        Lcom/daaw/mk1$c;,
        Lcom/daaw/mk1$e;,
        Lcom/daaw/mk1$d;
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/lk1;

.field public static final b:Lcom/daaw/lk1;

.field public static final c:Lcom/daaw/lk1;

.field public static final d:Lcom/daaw/lk1;

.field public static final e:Lcom/daaw/lk1;

.field public static final f:Lcom/daaw/lk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/mk1$e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/mk1$e;-><init>(Lcom/daaw/mk1$c;Z)V

    sput-object v0, Lcom/daaw/mk1;->a:Lcom/daaw/lk1;

    new-instance v0, Lcom/daaw/mk1$e;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/daaw/mk1$e;-><init>(Lcom/daaw/mk1$c;Z)V

    sput-object v0, Lcom/daaw/mk1;->b:Lcom/daaw/lk1;

    new-instance v0, Lcom/daaw/mk1$e;

    sget-object v1, Lcom/daaw/mk1$b;->a:Lcom/daaw/mk1$b;

    invoke-direct {v0, v1, v2}, Lcom/daaw/mk1$e;-><init>(Lcom/daaw/mk1$c;Z)V

    sput-object v0, Lcom/daaw/mk1;->c:Lcom/daaw/lk1;

    new-instance v0, Lcom/daaw/mk1$e;

    invoke-direct {v0, v1, v3}, Lcom/daaw/mk1$e;-><init>(Lcom/daaw/mk1$c;Z)V

    sput-object v0, Lcom/daaw/mk1;->d:Lcom/daaw/lk1;

    new-instance v0, Lcom/daaw/mk1$e;

    sget-object v1, Lcom/daaw/mk1$a;->b:Lcom/daaw/mk1$a;

    invoke-direct {v0, v1, v2}, Lcom/daaw/mk1$e;-><init>(Lcom/daaw/mk1$c;Z)V

    sput-object v0, Lcom/daaw/mk1;->e:Lcom/daaw/lk1;

    sget-object v0, Lcom/daaw/mk1$f;->b:Lcom/daaw/mk1$f;

    sput-object v0, Lcom/daaw/mk1;->f:Lcom/daaw/lk1;

    return-void
.end method

.method public static a(I)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v0
.end method

.method public static b(I)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    packed-switch p0, :pswitch_data_0

    return v1

    :cond_0
    :pswitch_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :pswitch_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
