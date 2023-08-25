.class public interface abstract Lcom/daaw/gl2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final g:Lcom/daaw/gl2;

.field public static final h:Lcom/daaw/gl2;

.field public static final i:Lcom/daaw/gl2;

.field public static final j:Lcom/daaw/gl2;

.field public static final k:Lcom/daaw/gl2;

.field public static final l:Lcom/daaw/gl2;

.field public static final m:Lcom/daaw/gl2;

.field public static final n:Lcom/daaw/gl2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/br2;

    invoke-direct {v0}, Lcom/daaw/br2;-><init>()V

    sput-object v0, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    new-instance v0, Lcom/daaw/xi2;

    invoke-direct {v0}, Lcom/daaw/xi2;-><init>()V

    sput-object v0, Lcom/daaw/gl2;->h:Lcom/daaw/gl2;

    new-instance v0, Lcom/daaw/oa2;

    const-string v1, "continue"

    invoke-direct {v0, v1}, Lcom/daaw/oa2;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/gl2;->i:Lcom/daaw/gl2;

    new-instance v0, Lcom/daaw/oa2;

    const-string v1, "break"

    invoke-direct {v0, v1}, Lcom/daaw/oa2;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/gl2;->j:Lcom/daaw/gl2;

    new-instance v0, Lcom/daaw/oa2;

    const-string v1, "return"

    invoke-direct {v0, v1}, Lcom/daaw/oa2;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/gl2;->k:Lcom/daaw/gl2;

    new-instance v0, Lcom/daaw/g92;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lcom/daaw/g92;-><init>(Ljava/lang/Boolean;)V

    sput-object v0, Lcom/daaw/gl2;->l:Lcom/daaw/gl2;

    new-instance v0, Lcom/daaw/g92;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lcom/daaw/g92;-><init>(Ljava/lang/Boolean;)V

    sput-object v0, Lcom/daaw/gl2;->m:Lcom/daaw/gl2;

    new-instance v0, Lcom/daaw/wp2;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/daaw/wp2;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/gl2;->n:Lcom/daaw/gl2;

    return-void
.end method


# virtual methods
.method public abstract d(Ljava/lang/String;Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
.end method

.method public abstract zzd()Lcom/daaw/gl2;
.end method

.method public abstract zzg()Ljava/lang/Boolean;
.end method

.method public abstract zzh()Ljava/lang/Double;
.end method

.method public abstract zzi()Ljava/lang/String;
.end method

.method public abstract zzl()Ljava/util/Iterator;
.end method
