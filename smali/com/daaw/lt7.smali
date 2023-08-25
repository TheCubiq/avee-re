.class public abstract Lcom/daaw/lt7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/lt7;

.field public static final b:Lcom/daaw/lt7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/et7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/et7;-><init>(Lcom/daaw/dt7;)V

    sput-object v0, Lcom/daaw/lt7;->a:Lcom/daaw/lt7;

    new-instance v0, Lcom/daaw/gt7;

    invoke-direct {v0, v1}, Lcom/daaw/gt7;-><init>(Lcom/daaw/ft7;)V

    sput-object v0, Lcom/daaw/lt7;->b:Lcom/daaw/lt7;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/kt7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Lcom/daaw/lt7;
    .locals 1

    sget-object v0, Lcom/daaw/lt7;->a:Lcom/daaw/lt7;

    return-object v0
.end method

.method public static e()Lcom/daaw/lt7;
    .locals 1

    sget-object v0, Lcom/daaw/lt7;->b:Lcom/daaw/lt7;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)Ljava/util/List;
.end method

.method public abstract b(Ljava/lang/Object;J)V
.end method

.method public abstract c(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
