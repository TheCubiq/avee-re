.class public final Lcom/daaw/lp1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/lp1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/lp1;

    invoke-direct {v0}, Lcom/daaw/lp1;-><init>()V

    sput-object v0, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlin.Unit"

    return-object v0
.end method
