.class public final synthetic Lcom/daaw/k64;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/b35;


# static fields
.field public static final synthetic a:Lcom/daaw/k64;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/k64;

    invoke-direct {v0}, Lcom/daaw/k64;-><init>()V

    sput-object v0, Lcom/daaw/k64;->a:Lcom/daaw/k64;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/daaw/m75;->c:Lcom/daaw/j65;

    invoke-static {}, Lcom/daaw/rk8;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
