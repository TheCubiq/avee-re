.class public final Lcom/daaw/xs6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zs6;


# static fields
.field public static final a:Lcom/daaw/fj2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/daaw/fj2;->F0()Lcom/daaw/fj2;

    move-result-object v0

    sput-object v0, Lcom/daaw/xs6;->a:Lcom/daaw/fj2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/fj2;
    .locals 1

    sget-object v0, Lcom/daaw/xs6;->a:Lcom/daaw/fj2;

    return-object v0
.end method
