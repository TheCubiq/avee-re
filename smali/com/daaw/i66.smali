.class public final synthetic Lcom/daaw/i66;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final synthetic a:Lcom/daaw/i66;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/i66;

    invoke-direct {v0}, Lcom/daaw/i66;-><init>()V

    sput-object v0, Lcom/daaw/i66;->a:Lcom/daaw/i66;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/daaw/n66;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/n66;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
