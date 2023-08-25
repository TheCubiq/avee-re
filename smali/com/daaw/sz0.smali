.class public abstract Lcom/daaw/sz0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/yz0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/daaw/yz0;->a()Lcom/daaw/yz0$a;

    move-result-object v0

    sget-object v1, Lcom/daaw/v7;->a:Lcom/daaw/dj;

    invoke-virtual {v0, v1}, Lcom/daaw/yz0$a;->d(Lcom/daaw/dj;)Lcom/daaw/yz0$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yz0$a;->c()Lcom/daaw/yz0;

    move-result-object v0

    sput-object v0, Lcom/daaw/sz0;->a:Lcom/daaw/yz0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, Lcom/daaw/sz0;->a:Lcom/daaw/yz0;

    invoke-virtual {v0, p0}, Lcom/daaw/yz0;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lcom/daaw/wf;
.end method
